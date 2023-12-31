package Queue;

import LinkedList.Node;

public class usingLL {
    Node front;
    Node rear;
    int size;


    public usingLL() {
        //Implement the Constructor
        front=null;
        rear=null;
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        if( front==null){
            front=new Node(data);
            rear=front;

        }
        Node n=new Node(data);
        rear.next=n;
        size++;
    }


    public int dequeue() {
        //Implement the dequeue() function
        if(front==null){
            return -1;
        }

        size--;
        front=front.next;
        int x= (int) front.data;
        return x;
    }


    public int front() {
        //Implement the front() function
        if(front==null){
            return -1;
        }
        return (int) front.data;
    }
}
