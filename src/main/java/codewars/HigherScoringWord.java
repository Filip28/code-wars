package codewars;

import java.util.*;

public class HigherScoringWord {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    String betterSolution(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).orElseThrow(() -> new RuntimeException("Element not found!"));
    }

    String countScore(String stringOfWords) {
        String[] words = stringOfWords.split(" ");
        Map<String, Integer> wordsScore = new LinkedHashMap<>();
        for (String word : words) {
            wordsScore.put(word, count(word));
        }
        return getWorldWithHighestScore(wordsScore);
    }

    private int count(String word) {
        Map<String, Integer> alphabetScores = getAlphabetScores();
        int sum = 0;
        for (String character : word.split("")) {
            if (alphabetScores.containsKey(character)) {
                sum += alphabetScores.get(character);
            }
        }
        return sum;
    }

    private Map<String, Integer> getAlphabetScores() {
        Map<String, Integer> map = new HashMap<>();
        char[] chars = ALPHABET.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(Character.toString(chars[i]), i + 1);
        }
        return map;
    }

    private String getWorldWithHighestScore(Map<String, Integer> wordsScore) {
        return wordsScore
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Element not found!"))
                .getKey();
    }

}
