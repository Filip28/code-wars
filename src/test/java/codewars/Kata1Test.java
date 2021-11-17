package codewars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.of;

class Kata1Test {

    Kata1 kata = new Kata1();

    @ParameterizedTest
    @MethodSource("providesStringForTest")
    void shouldReturnOneLetterFromTheMiddleOfString(String word, String expectedResult) {
        // given + when
        String result = kata.getMiddle(word);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturnTwoLettersFromTheMiddleOfString() {
        // given
        String s = "test";

        // when
        String result = kata.getMiddle(s);

        // then
        assertEquals("es", result);
    }

    private static Stream<Arguments> providesStringForTest() {
        return Stream.of(
                of("A", "A"),
                of("testing", "t")
        );
    }
}