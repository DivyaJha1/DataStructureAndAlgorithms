package LinkedList;

public class printNodeI {
    public static void printIthNode(Node<Integer> head, int i){
        if(head==null){
            return;
        }
        int count=0;
        while( head!=null){
            if(count==i){
                System.out.print(head.data);
            }
            count++;
            head=head.next;
        }


    }
}
