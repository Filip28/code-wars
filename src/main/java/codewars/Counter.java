package codewars;

import java.util.Arrays;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(p -> p != null && p.equals(true) )
                .count();
    }
}
