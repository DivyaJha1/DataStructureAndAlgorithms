package LinkedList;

public class kReverse {
    /*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/



        public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
            //Your code goes here
            if(head == null || k==0){
                return head;
            }
            LinkedListNode<Integer> current = head;
            LinkedListNode<Integer> next = null;
            LinkedListNode<Integer> prev = null;

            int count = 0;


            while (count < k && current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            if (next != null){
                head.next = kReverse(next, k);
            }

            return prev;


        }

    }

