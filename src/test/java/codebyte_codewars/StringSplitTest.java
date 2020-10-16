package codebyte_codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

class StringSplitTest {

    StringSplit stringSplit = new StringSplit();

    @ParameterizedTest
    @MethodSource("providesStringForTest")
    void shouldReturnListOfCharactersPair(String string, String expectedResult) {
        // given + when
        String[] result = stringSplit.solution(string);

        // then
        assertEquals(expectedResult, Arrays.toString(result));
    }

    private static Stream<Arguments> providesStringForTest() {
        return Stream.of(
                of("abcdef", Arrays.toString(new String[]{"ab", "cd", "ef"})),
                of("abc", Arrays.toString(new String[]{"ab", "c_"}))
        );
    }

}