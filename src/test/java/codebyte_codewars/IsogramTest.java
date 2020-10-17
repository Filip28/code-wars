package codebyte_codewars;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
class IsogramTest {

    @ParameterizedTest
    @ValueSource(strings = {"moOse", "isIsogram", "aba"})
    void shouldReturnFalseOnDuplicatedCharacters(String str) {
        // given + when
        boolean result = Isogram.isIsogram(str);

        // then
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "isogram", "Dermatoglyphics"})
    void shouldReturnTrueOnNotDuplicatedCharacters(String str) {
        // given + when
        boolean result = Isogram.isIsogram(str);

        // then
        assertTrue(result);
    }

}