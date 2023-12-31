package LinkedList;

public class appendLastNtoFirst {
    public static Node<Integer> append(Node<Integer> head, int n) {
        //Your code goes here
        int x=len(head);
        if(n==0 || n>x){
            return head;
        }



        Node<Integer> temp= head;
        Node<Integer> temp1;
        int count=1;
        while(count<x-n && temp!=null){
            temp=temp.next;
            count++;
        }
        temp1=temp.next;
        temp.next=null;
        temp=temp1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return temp1;

    }

    public static int len(Node<Integer> head){
        int c=0;
        while(head!=null){
            head=head.next;
            c++;
        }
        return c;
    }

}
