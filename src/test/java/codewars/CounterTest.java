package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {

    private final Counter counter = new Counter();

    @Test
    void shouldCountedTrueBooleanValues() {
        // given
        Boolean[] array = new Boolean[]{true, true, true, false, null};

        // when
        int result = counter.countSheeps(array);

        // then
        assertEquals(3, result);

    }

}