package codebyte_codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindOutlier {
    public int find(int[] integers) {
        int[] array = Arrays.stream(integers).filter(i -> i % 2 == 0).toArray();
        return array.length == 1 ? array[0] : Arrays.stream(integers).boxed().filter(i -> i % 2 != 0).collect(Collectors.toList()).get(0);
    }

}

