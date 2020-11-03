package codebyte_codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata6Test {

    private final Kata6 kata = new Kata6();

    @Test
    void shouldReturnTrueWhenYouAreAboveAverage() {
        // given
        int[] classPoints = {2, 3};
        int yourPoints = 5;

        // when
        boolean result = kata.betterThanAverage(classPoints, yourPoints);

        // then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenYouAreBelowAverage() {
        // given
        int[] classPoints = {100, 90};
        int yourPoints = 11;

        // when
        boolean result = kata.betterThanAverage(classPoints, yourPoints);

        // then
        assertFalse(result);
    }
}