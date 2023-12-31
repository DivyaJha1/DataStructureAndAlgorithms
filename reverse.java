package LinkedList;

public class reverse {
    /*

    Following is the Node class already written for the Linked List

    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

*/

        public static Node<Integer> reverseRec(Node<Integer> head) {
            //Your code goes here
            if(head==null || head.next==null){
                return head;
            }

            Node<Integer> l=reverseRec(head.next);
            head.next.next=head;
            head.next=null;



            return l;
        }


}
