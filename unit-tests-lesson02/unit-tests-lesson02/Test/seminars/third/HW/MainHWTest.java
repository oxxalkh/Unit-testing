package seminars.third.HW;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {

    @Test
    @DisplayName("Проверка четности числа 0")
    void testZeroNumber() {
        assertTrue(MainHW.evenOddNumber(0));
    }
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 10})
    @DisplayName("Положительные четные числа")
    void testPositiveEvenNumber(int n) {
        assertTrue(MainHW.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {-2, -4, -10})
    @DisplayName("Отрицательные четные числа")
    void testNegativeEvenNumber(int n) {
        assertTrue(MainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 7})
    @DisplayName("Положительные нечетные числа")
    void testPositiveOddNumber(int n) {
        assertFalse(MainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -7})
    @DisplayName("Отрицательные нечетные числа")
    void testNegativeOddNumber(int n) {
        assertFalse(MainHW.evenOddNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    @DisplayName("Проверка валидных граничных значений интервала")
    void testBorderlineCase(int n) {
        assertFalse(MainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    @DisplayName("Проверка валидных значений интервала")
    void testPositiveCase(int n) {
        assertTrue(MainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {24, 0, 101})
    @DisplayName("Проверка невалидных граничных значений интервала")
    void testNegativeCase(int n) {
        assertFalse(MainHW.numberInInterval(n));
    }

//
//
//    @Test
//    void evenOddNumberTrue() {
//        boolean a = MainHW.evenOddNumber(10);
//
//        assertThat(a).isEqualTo(true);
//
//    }
//    @Test
//    void evenOddNumberFalse() {
//        boolean b = MainHW.evenOddNumber(9);
//        assertThat(b).isEqualTo(false);
//    }
//
//
//    @Test
//    void numberInIntervalTrue() {
//        boolean a = MainHW.numberInInterval(50);
//        assertThat(a).isEqualTo(true);
//    }
//
//    @Test
//    void numberInIntervalFalse() {
//        boolean b = MainHW.numberInInterval(5);
//        assertThat(b).isEqualTo(false);
//    }

}