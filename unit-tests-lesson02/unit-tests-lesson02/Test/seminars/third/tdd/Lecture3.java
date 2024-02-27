package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Lecture3 {
    // Попробуйте реализовать в калькуляторе
// с помощью методологии TDD (с описанием шагов)
// функцию расчета длины окружности

    @Test
    void circleLengthTest() {
        Circle circle = new Circle();
        Double expected = 62.83185307179586;

        Double result = circle.calculateLength(10);

        assertThat(result).isEqualTo(expected);
    }

}
