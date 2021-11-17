package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DnaToRna {

    String convert(String dna) {
        List<String> split = Arrays.asList(dna.split(""));
        return split
                .stream()
                .map(c -> {
                    if (c.equalsIgnoreCase("T")) {
                        return "U";
                    }
                    return c;
                })
                .collect(Collectors.joining());
    }
}
