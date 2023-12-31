package LinkedList;

public class insertAtI {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        //Your code goes here
        Node<Integer> ans=new Node(data);
        if(pos==0){
            ans.next=head;
            return ans;
        }

        int count =0;
        Node<Integer> temp=head;
        while(temp!=null){
            if(count==pos-1){
                ans.next=temp.next;
                temp.next=ans;
            }
            temp=temp.next;
            count++;
        }

        return head;


    }

}
