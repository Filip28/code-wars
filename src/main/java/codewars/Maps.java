package codewars;

import java.util.Arrays;

public class Maps {
    public static int[] map(int[] arr) {
        return Arrays
                .stream(arr)
                .map(number -> number * 2)
                .toArray();
    }
}
