package Stacks;

import LinkedList.Node;



/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

    public class UsingLL {

        //Define the data members
        private Node head;
        private int size;


        public UsingLL() {
            //Implement the Constructor
            head=null;
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

        public void push(int element) {
            //Implement the push(element) function
            Node n=new Node(element);
            ((Node<?>) n).next=head;
            head=n;
            size++;

        }

        public int pop() {
            //Implement the pop() function
            if(head==null){
                return -1;
            }
            int x= (int) head.data;
            size--;
            head=head.next;
            return x;
        }

        public int top() {
            //Implement the top() function
            if(head==null){
                return -1;
            }
            return (int) head.data;
        }
    }

