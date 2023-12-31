package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class revFirstK {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=k;i++){
            q.offer(input.poll());
        }
        reverseQueue(q);
        while(!input.isEmpty()){
            q.offer(input.poll());
        }
        return q;
    }


    public static void reverseQueue(Queue<Integer> input) {
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
