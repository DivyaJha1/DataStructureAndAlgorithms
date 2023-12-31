package LinkedList;

public class eliminateDup {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here
        if(head==null){
            return head;
        }

        Node<Integer>ans= head;

        while(ans.next!=null){
            if(ans.data.equals(ans.next.data)){
                ans.next=ans.next.next;
            }
            else{
                ans=ans.next;
            }
        }


        return head;

    }
}
