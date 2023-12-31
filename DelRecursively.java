package LinkedList;

public class DelRecursively {
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




        public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
            //Your code goes here
            int x=len(head);

            if(x<=pos){
                return head;
            }

            if(pos==0 && head!=null){
                return head.next;
            }
            if(head==null){
                return head;
            }
            head.next = deleteNodeRec(head.next, pos - 1);
            return head;


        }
        public static int len(Node <Integer> head){
            int x=0;
            while(head!=null){
                x++;
                head=head.next;
            }
            return x;
        }

    }

