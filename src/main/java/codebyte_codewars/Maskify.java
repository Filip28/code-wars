package codebyte_codewars;

public class Maskify {


    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }

    public static String maskify(String str) {
        if(str.length() <= 4) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            int charToMask = str.length() - 4;
            sb
                    .append("#".repeat(charToMask))
                    .append(str, charToMask, str.length());
            return sb.toString();
        }
    }
}
