package seminars.fourth.database;

//Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
//Условие: У вас есть класс Database с методом public List<String> query(String sql), который выполняет SQLзапрос и возвращает результат.
//Вам необходимо проверить правильность работы класса DataProcessor, который использует Database для
//выполнения запроса и обработки результатов.


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {

    @Test
    void testDataProcessor() {
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);
        when(database.query(anyString())).thenReturn(Arrays.asList("123", "ol", "abc"));


        List<String> string = dataProcessor.processData("table");

        assertThat(string).isNotNull().isNotEmpty().contains("123").hasSize(3);

    }

}