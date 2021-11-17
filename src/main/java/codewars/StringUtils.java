package codewars;

public class StringUtils {

    public String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    // Alternative with stream
//    Arrays.stream(string.split(""))
//            .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
//            .collect(Collectors.joining(""));
}
