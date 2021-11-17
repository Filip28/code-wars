package codewars;

import java.util.Arrays;

public class Kata6 {
    public boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double average = Arrays
                .stream(classPoints)
                .asDoubleStream()
                .average()
                .orElse(0);
        return yourPoints > average;
    }
}