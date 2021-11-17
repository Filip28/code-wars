package codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class AlarmTest {

    private final Alarm alarm = new Alarm();

    @Test
    void shouldReturnTrueWhenEmployeeNotOnTheVacation() {
        // given
        boolean employed = true;
        boolean vacation = false;

        // when
        boolean result = alarm.setAlarm(employed, vacation);

        // then
        assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("valuesForFalseTest")
    void shouldReturnFalseWhenEmployeeDontHaveToSetAlarm(boolean employed, boolean onVacation, boolean expectedResult) {
        // given + when
        boolean result = alarm.setAlarm(employed, onVacation);

        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> valuesForFalseTest() {
        return Stream.of(
                of(true, true, false),
                of(false, true, false),
                of(false, false, false)
        );
    }
}