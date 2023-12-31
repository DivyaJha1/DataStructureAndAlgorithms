package LinkedList;

public class isPal {
    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return true;
        }
        Node<Integer> t1=head;
        Node<Integer> t2=head;

        while(t2!=null && t2.next!=null ){
            t1=t1.next;
            t2=t2.next.next;
        }

        Node<Integer> prev = null;
        Node<Integer> current = t1;
        Node<Integer> nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        t2=prev;

        while(t2!=null){
            if(t2.data!=head.data){
                return false;
            }
            head=head.next;
            t2=t2.next;
        }
        return true;


    }
}
