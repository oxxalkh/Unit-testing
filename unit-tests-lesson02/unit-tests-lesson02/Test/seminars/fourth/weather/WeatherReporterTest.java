package seminars.fourth.weather;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
//Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
//обращающийся к внешнему API для получения информации о текущей температуре.
//Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
//Создайте мок-объект для WeatherService с использованием Mockito.


class WeatherReporterTest {
    @Test
    void testingGenerateReport() {
        WeatherService mockWeatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(15);

        String str = weatherReporter.generateReport();

        assertThat(str).isEqualTo("Текущая температура: " + 15 + " градусов.");
    }

}