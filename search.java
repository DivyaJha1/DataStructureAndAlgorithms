package LinkedList;

public class search {
    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        int count =-1;
        while(head!=null){
            count++;
            if(head.data==n){
                return count;
            }
            head=head.next;
        }
        return -1;
    }
}
