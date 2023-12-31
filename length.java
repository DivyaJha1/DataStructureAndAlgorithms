package LinkedList;

public class length {
    public static int length(Node head){
        //Your code goes here
        if(head==null){
            return 0;
        }
        return 1+ length(head.next);
    }
}
