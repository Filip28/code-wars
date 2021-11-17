package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public static void main(String[] args) {
        SpinWords sw = new SpinWords();
        System.out.println(sw.spinWords("Hey fellow warriors"));
    }

    public String spinWords(String sentence) {
        return Arrays
                .stream(sentence.split(" "))
                .map(word -> {
                    if (word.length() >= 5) {
                        return new StringBuilder(word).reverse().toString();
                    }
                    return word;
                })
                .collect(Collectors.joining(" "));
    }
}