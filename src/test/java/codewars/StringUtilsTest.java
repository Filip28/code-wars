package codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @ParameterizedTest
    @MethodSource("providesStringAndExpectedResultForTest")
    void shouldReplaceCaseInString(String s, String expectedResult) {
        // given + when
        String result = stringUtils.toAlternativeString(s);

        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> providesStringAndExpectedResultForTest() {
        return Stream.of(
                of("hello world", "HELLO WORLD"),
                of("1a2b3c4d5e", "1A2B3C4D5E")
        );
    }

}