package codebyte_codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FakeBinary {
    public String fakeBin(String numberString) {
        return Arrays
                .stream(numberString.split(""))
                .map(n -> {
                    if (Integer.parseInt(n) < 5) {
                        return "0";
                    } else {
                        return "1";
                    }
                })
                .collect(Collectors.joining());
    }
}
