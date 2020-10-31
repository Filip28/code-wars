package codebyte_codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int repeats(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .forEach(n -> {
                    if (!map.containsKey(n)) {
                        map.put(n, 1);
                    } else {
                        Integer occurrences = map.get(n);
                        map.put(n, occurrences + 1);
                    }
                });
        return map
                .entrySet()
                .stream()
                .filter(k -> k.getValue() == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();

    }
}
