package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void shouldNegatePositiveNumber() {
        // given
        int number = 10;

        // when
        int result = Kata.makeNegative(number);

        // then
        assertEquals(-10, result);
    }

    @Test
    void shouldReturnNumberWithoutChangesOnNegativeNumber() {
        // given
        int number = -10;

        // when
        int result = Kata.makeNegative(number);

        // then
        assertEquals(-10, result);
    }

    @Test
    void shouldReturnZeroOnZeroNumber() {
        // given
        int number = 0;

        // when
        int result = Kata.makeNegative(number);

        // then
        assertEquals(0, result);
    }

}