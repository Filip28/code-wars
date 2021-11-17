package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata5Test {

    private final Kata5 kata = new Kata5();


    @Test
    void shouldReturnFlattenArrayOnTwoDimensionArray() {
        // given
        int[][] arr = new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}};

        // when
        int[] result = kata.flattenAndSort(arr);

        // then
        assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, result);
    }
}