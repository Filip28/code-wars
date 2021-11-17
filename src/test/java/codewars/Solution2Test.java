package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private final Solution2 solution = new Solution2();

    @Test
    void shouldReturnSumOfNumbersWhichOccurredOnce() {
        // given
        int[] arr = new int[]{9, 10, 19, 13, 19, 13};

        // when
        int result = solution.repeats(arr);

        // then
        assertEquals(19, result);
    }

}