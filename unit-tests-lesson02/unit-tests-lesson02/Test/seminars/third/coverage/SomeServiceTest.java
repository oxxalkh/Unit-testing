package seminars.third.coverage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {

    SomeService someService;
    @BeforeEach
    void setUp() {
        someService = new SomeService();
    }
// 3.1.

    @Test
    void multipleThreeNotFiveReturnsFizz() {
        assertEquals("Fizz", someService.fizzBuzz(6));
    }

    @Test
    void multipleFiveNotThreeReturnsBuzz() {
        assertEquals("Buzz", someService.fizzBuzz(10));
    }

    @Test
    void multipleThreeAndFiveReturnsFizzBuzz() {
        assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }

    @Test
    void multipleNotThreeNotFiveReturnsI() {
        assertEquals("4", someService.fizzBuzz(4));
    }

    // 3.2
    @Test
    void lastNumberIsSixReturnTrue() {
        int[] myArray = new int[] {1, 0, 1, 6};

        assertTrue(someService.firstLast6(myArray));
    }

    @Test
    void firstLastNumberNotSixReturnFalse() {
        int[] myArray = new int[] {1, 0, 1, 3};

        assertFalse(someService.firstLast6(myArray));
    }

    @Test
    void firstNumberIsSixReturnTrue() {
        int[] myArray = new int[] {6, 0, 1, 4};

        assertTrue(someService.firstLast6(myArray));
    }
    @ParameterizedTest
    @DisplayName("Скидка")
    @CsvSource({"2000.0, 50, 1000", "2000.0, 100, 0", "2000.0, 0, 2000"})
    void paramet(Double d, int a, int r){
        assertThat(someService.calculatingDiscount(d, a))
                .isEqualTo(r);
    }
    @ParameterizedTest
    @CsvSource({"2000.0, 101", "2000.0, -10"})
    void insufficientCoverage(Double p, int d){
        assertThatThrownBy(() ->
                someService.calculatingDiscount(p, d))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
    }


    @Test
    void testTwoThirteen() {
        assertEquals(8, someService.luckySum(13,4,4));
    }
    @Test
    void testOneThirteen() {
        assertEquals(6, someService.luckySum(1, 2, 3));
    }
}