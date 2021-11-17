package codewars;

import java.util.Arrays;

public class Kata5 {

    public int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }

}
