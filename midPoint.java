package LinkedList;

public class midPoint {
    public static Node<Integer> midPointLL(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> slow= head;
        Node<Integer> fast= head;
        while(fast.next!=null && fast.next.next!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;


    }
}
