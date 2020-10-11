package codebyte_codewars;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        new StringBuilder(s1)
                .append(s2)
                .chars()
                .distinct()
                .sorted()
                .forEach(ch -> result.append((char) ch));
        return result.toString();
    }
}
