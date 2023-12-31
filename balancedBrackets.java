package Stacks;

import java.util.Stack;

public class balancedBrackets {
    public static boolean isBalanced(String expression) {
        //Your code goes here
        if(expression.length()==0){
            return true;
        }
        if(expression.charAt(0)==')'){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='('){
                stack.push('(');
            }
            else if(expression.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
