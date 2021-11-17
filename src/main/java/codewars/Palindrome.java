package codewars;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print(palindromeCreator("raccecar"));
//        System.out.print(palindromeCreator("abjchba"));
        System.out.println(palindromeCreator("mmop"));
    }

    public static String palindromeCreator(String str) {
        if (isPalindrome(str)) {
            return "codebyte.Palindrome";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str, 0, i).append(str.substring(i + 1));
            if (isPalindrome(sb.toString())) {
                return String.valueOf(str.charAt(i));
            }
            sb.setLength(0);
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str, 0, i).append(str.substring(i + 1));
            for (int j = i; j < sb2.length(); j++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2.toString(), 0, j).append(sb2.substring(j + 1));
                if (isPalindrome(sb3.toString())) {
                    if (sb3.length() < 3) {
                        return "not possible";
                    }
                    return String.valueOf(str.charAt(i)) + sb2.charAt(j);
                }
            }
            sb2.setLength(0);
        }
        return "not possible";
    }

    private static boolean isPalindrome(String word) {
        int strLength = word.length();
        for (int i = 0; i < strLength / 2; i++)
            if (word.charAt(i) != word.charAt(strLength - i - 1)) return false;
        return true;
    }
}