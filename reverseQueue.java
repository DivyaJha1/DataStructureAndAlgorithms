package Queue;

import java.util.Queue;

public class reverseQueue {
    public static void revQueue(Queue<Integer> input) {
        //Your code goes here
        Stack<Integer> s= new Stack<Integer>();
        while(!input.isEmpty()){
            s.push(input.poll());
        }
        while(!s.isEmpty()){
            input.offer(s.pop());
        }
    }
}
