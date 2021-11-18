package codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BitCountTest {

    BitCount bitCount = new BitCount();

    @Test
    void shouldReturnNumberOfNumberOneFromGivenNumber() {
        // given
        int number = 1234;

        // when
        int result = bitCount.countBits(number);

        // then
        assertEquals(5, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"-123,0", "0,0"}, delimiter = ',')
    void shouldReturnZeroOnZeroOrNegativeNumber(int number, int expected) {
        // given

        // when
        int result = bitCount.countBits(number);

        // then
        assertEquals(expected, result);
    }
}