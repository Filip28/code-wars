package codebyte_codewars;

import java.util.stream.IntStream;

public class GrassHopper {

    public static int summation(int number) {
        return IntStream.rangeClosed(0, number).sum();
    }
}
