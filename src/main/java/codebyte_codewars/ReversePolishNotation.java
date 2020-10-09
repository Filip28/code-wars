package codebyte_codewars;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(reversePolishNotation("1 1 + 1 + 1 +"));
        System.out.println(reversePolishNotation("4 5 + 2 1 + *"));
    }


    public static String reversePolishNotation(String str) {
        String[] strings = str.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String ch : strings) {
            if (!"/*-+".contains(ch)) {
                stack.push(Integer.parseInt(ch));
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (ch) {
                    case "+": {
                        stack.push(num1 + num2);
                        break;
                    }
                    case "-": {
                        stack.push(num2 - num1);
                        break;
                    }
                    case "*": {
                        stack.push(num1 * num2);
                        break;
                    }
                    case "/": {
                        stack.push(num2 / num1);
                        break;
                    }
                }
            }
        }
        return String.valueOf(stack.pop());
    }
}
