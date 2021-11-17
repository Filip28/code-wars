package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }

    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" "))
                .map(String::toUpperCase)
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining("."));
    }
}
