package codewars;

import java.util.Arrays;

class Solution {

    public String toCamelCase(String s) {
        String[] words = s.split("[-_]+");
        return Arrays.stream(words)
                .skip(1)
                .map(w -> w.substring(0, 1).toUpperCase().concat(w.substring(1)))
                .reduce(words[0], String::concat);
    }
}
