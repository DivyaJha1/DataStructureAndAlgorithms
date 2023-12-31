package LinkedList;

public class mergeSortedLL {
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

    }

