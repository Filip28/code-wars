package codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class MoneyTest {

    private final Money money = new Money();

    @ParameterizedTest
    @MethodSource("valuesForCalculation")
    void shouldReturnNumberOfYearsWhenWeReachOurGoal(
            double principal,
            double interest,
            double tax,
            double desire,
            int expectedResult
    ) {
        // given
        // when
        int result = money.calculateYears(principal, interest, tax, desire);

        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> valuesForCalculation() {
        return Stream.of(
                of(1000, 0.05, 0.18, 1100, 3),
                of(1000, 0.01625, 0.18, 1200, 14),
                of(1000, 0.05, 0.18, 1000, 0)
        );
    }
}