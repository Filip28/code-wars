package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoToOneTest {

    @Test
    void shouldReturnSortedDistinctString() {
        // given
        String s1 = "aretheyhere";
        String s2 = "yestheyarehere";

        // when
        String result = TwoToOne.longest(s1, s2);

        // then
        assertEquals("aehrsty", result);

    }

}