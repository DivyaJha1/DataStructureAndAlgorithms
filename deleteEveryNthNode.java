package LinkedList;

public class deleteEveryNthNode {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        //Your code goes here
        if(head==null || M==0){
            return null;
        }
        if(N==0){
            return head;
        }
        Node<Integer>temp= head;
        //int x=0;
        while(temp!=null){
            for(int x=1;x<M &&temp!=null;x++){
                temp=temp.next;
            }
            if(temp==null){
                break;
            }
            Node<Integer>temp1= temp.next;
            for(int x=0;x<N && temp1!=null;x++){
                temp1=temp1.next;
            }
            temp.next=temp1;
            temp=temp.next;

        }
        return head;

    }
}
