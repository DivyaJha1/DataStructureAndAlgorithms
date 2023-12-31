package LinkedList;

public class deleteAtI {
    public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
        // Write your code here.
        Node<Integer>temp= head;
        if(head==null){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        int count=0;
        while(head!=null  && count<pos-1){
            count ++;
            head=head.next;
        }
        if( head!=null && head.next!=null){
            head.next=head.next.next;
        }

        return temp;
    }
}
