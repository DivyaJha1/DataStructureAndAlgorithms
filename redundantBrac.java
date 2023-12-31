package Stacks;

import java.util.Stack;

public class redundantBrac {
    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here

        Stack<Character> stack = new Stack<>();
        char[] str = expression.toCharArray();
        for (char c : str) {


            if (c == ')') {
                char top = stack.peek();
                stack.pop();

                boolean check = true;

                while (top != '(') {
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        check = false;
                    }
                    top = stack.peek();
                    stack.pop();
                }

                if (check == true) {
                    return true;
                }
            } else {
                stack.push(c);
            }
        }
        return false;

    }
}

