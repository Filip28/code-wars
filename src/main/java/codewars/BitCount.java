package codewars;

import java.util.Arrays;

public class BitCount {

    int betterSolution(int n) {
        return Integer.bitCount(n);
    }

    int countBits(int number) {
        if (number <= 0) {
            return 0;
        }
        String bits = Integer.toBinaryString(number);
        return Arrays.stream(bits.split(""))
                .mapToInt(c -> {
                    if (c.equalsIgnoreCase("1")) {
                        return 1;
                    }
                    return 0;
                })
                .sum();
    }
}
