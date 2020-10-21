package codebyte_codewars;

public class Kata1 {
    public String getMiddle(String word) {
        int middleChar = word.length() / 2;
        return word.length() % 2 != 0 ? word.substring(middleChar, middleChar+1) : word.substring(middleChar-1, middleChar+1);
    }
}
