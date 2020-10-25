package codebyte_codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shouldReturnCamelCaseStringOnHyphens() {
        // given
        String s = "the-stealth-warrior";

        // when
        String result = solution.toCamelCase(s);

        // then
        assertEquals("theStealthWarrior", result);
    }

    @Test
    void shouldReturnCamelCaseStringOnUnderscores() {
        // given
        String s = "The_Stealth_Warrior";

        // when
        String result = solution.toCamelCase(s);

        // then
        assertEquals("TheStealthWarrior", result);
    }
}