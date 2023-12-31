package Queue;

import java.util.*;
public class Stack<T> {

    //Define the data members
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;



    public Stack() {
        //Implement the Constructor
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        top=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return q1.isEmpty();
    }

    public void push(int element) {
        //Implement the push(element) function
        q2.add(element);
        top = element;
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }

    public int pop() {
        //Implement the pop() function
        if(q1.isEmpty()){
            return -1;
        }



        return q1.remove();
    }

    public int top() {
        //Implement the top() function
        if (q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}
