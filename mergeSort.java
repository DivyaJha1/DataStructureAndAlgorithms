package LinkedList;

public class mergeSort {
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


        public static Node<Integer> mergeSort(Node<Integer> head) {
            //Your code goes here
            if(head==null || head.next==null){
                return head;
            }
            Node<Integer> h1=head;
            Node<Integer> h=mid(head);
            Node<Integer> h2=h.next;
            h.next=null;

            Node<Integer> n1=mergeSort(h1);
            Node<Integer> n2=mergeSort(h2);
            Node<Integer> n=mergeTwoSorteds(n1,n2);
            return n;

        }

        public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
            //Your code goes here
            if (head1 == null) {
                return head2;
            }
            if (head2 == null) {
                return head1;
            }

            if (head1.data < head2.data) {
                head1.next = mergeTwoSorteds(head1.next, head2);
                return head1;
            } else {
                head2.next = mergeTwoSorteds(head1, head2.next);
                return head2;
            }

        }

        public static Node<Integer> mid(Node<Integer> n){
            if(n==null || n.next==null){
                return n;
            }
            Node<Integer> slow=n;
            Node<Integer> fast=n;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

    }

