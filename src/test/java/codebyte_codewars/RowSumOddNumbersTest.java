package codebyte_codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.of;

class RowSumOddNumbersTest {

    private final RowSumOddNumbers rowSumOddNumbers = new RowSumOddNumbers();

    @ParameterizedTest
    @MethodSource("valuesForTest")
    void shouldReturnSumOfOddNumber(int rowNumber, int expectedResult) {
        // given + when
        int result = rowSumOddNumbers.rowSumOddNumbers(rowNumber);

        // then
        Assertions.assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> valuesForTest() {
        return Stream.of(
                of(2, 8),
                of(42, 74088)
        );
    }
}