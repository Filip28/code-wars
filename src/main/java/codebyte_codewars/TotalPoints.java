package codebyte_codewars;

import java.util.Arrays;

public class TotalPoints {

    public int points(String[] games) {
        return Arrays
                .stream(games)
                .map(score -> {
                    String[] separateScore = score.split(":");
                    if (Integer.parseInt(separateScore[0]) > Integer.parseInt(separateScore[1])) {
                        return 3;
                    } else if (Integer.parseInt(separateScore[0]) == Integer.parseInt(separateScore[1])) {
                        return 1;
                    }
                    return 0;
                }).mapToInt(value -> value)
                .sum();
    }
}