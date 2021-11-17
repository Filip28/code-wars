package codewars;

public class DnaStrand {

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }

    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        return replaceChars(chars);
    }

    private static String replaceChars(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            if (ch == 'A') {
                sb.append('T');
            } else if (ch == 'T') {
                sb.append('A');
            } else if (ch == 'C') {
                sb.append('G');
            } else {
                sb.append('C');
            }
        }
        return sb.toString();
    }
}
