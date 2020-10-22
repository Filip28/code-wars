package codebyte_codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class GrassHopperTest {

    @ParameterizedTest
    @MethodSource("providesIntForTest")
    void shouldReturnSumOfNumber(int number, int expectedResult) {
        // given

        // when
        int result = GrassHopper.summation(number);

        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> providesIntForTest() {
        return Stream.of(
                of(0, 0),
                of(1, 1),
                of(8, 36)
        );
    }

}