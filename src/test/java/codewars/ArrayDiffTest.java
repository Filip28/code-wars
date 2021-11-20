package codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class ArrayDiffTest {

    ArrayDiff arrayDiff = new ArrayDiff();

    @ParameterizedTest
    @MethodSource("dataToTest")
    void shouldReturnArrayWithDifferencesBetweenArrays(int[] expectedResult, int[] arr1, int[] arr2) {
        // given
        // when
        var result = arrayDiff.checkDiff(arr1, arr2);

        // then
        assertArrayEquals(expectedResult, result);
    }

    static Stream<Arguments> dataToTest() {
        return Stream
                .of(
                        of(new int[]{2}, new int[]{1, 2}, new int[]{1}),
                        of(new int[]{2, 2}, new int[]{1, 2, 2}, new int[]{1}),
                        of(new int[]{1}, new int[]{1, 2, 2}, new int[]{2}),
                        of(new int[]{1, 2, 2}, new int[]{1, 2, 2}, new int[]{}),
                        of(new int[]{}, new int[]{}, new int[]{1, 2})
                );
    }

}