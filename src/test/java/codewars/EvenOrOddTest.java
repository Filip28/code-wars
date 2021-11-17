package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void shouldReturnEvenOnCorrectNumber() {
        // given
        int evenNumber = 2;

        // when
        String result = EvenOrOdd.even_or_odd(evenNumber);

        // then
        assertEquals("Even", result);
    }

    @Test
    void shouldReturnOddOnCorrectNumber() {
        // given
        int oddNumber = 3;

        // when
        String result = EvenOrOdd.even_or_odd(oddNumber);

        // then
        assertEquals("Odd", result);
    }

}