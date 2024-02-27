package seminars.fourth.HTTP;

/*Вам нужно написать тест с использованием моков для класса, который выполняет HTTP-запросы.
Условие: У вас есть класс HttpClient с методом public String get(String url), который выполняет
HTTP-запрос и возвращает результат. Вам необходимо проверить правильность работы класса
WebService, который использует HttpClient для получения данных с веб-сайта.*/

import org.junit.jupiter.api.Test;



import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WebServiseTest {
    @Test
    void testWebService() {
        HttpClient mockHttpClient = mock(HttpClient.class);
        WebService webService = new WebService(mockHttpClient);
        when(mockHttpClient.get(anyString())).thenReturn("Ok");

        String result = webService.request("body");

        assertThat(result).isEqualTo("Ok");

    }
}
