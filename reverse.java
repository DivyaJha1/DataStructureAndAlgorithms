package Stacks;

import java.util.Stack;

public class reverse {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here
        if(input.isEmpty()){
            return;
        }
        int a=input.pop();
        reverseStack(input, extra);
        while(!input.isEmpty()){
            extra.push(input.pop());
        }
        input.push(a);
        while(!extra.isEmpty()){
            input.push(extra.pop());
        }

    }
}
