package codebyte_codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSplit {
    public String[] solution(String s) {
        List<String> split = Arrays
                .stream(s.split("(?<=\\G.{2})"))
                .collect(Collectors.toList());
        return split
                .stream()
                .map(pair -> (pair.length() % 2 != 0) ? pair + "_" : pair)
                .toArray(String[]::new);
    }
}
