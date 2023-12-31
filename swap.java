package LinkedList;

public class swap {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here
        if(head==null || i==j){
            return head;
        }
        if(i==0){
            int x=0;
            Node<Integer>t= head;
            while(x<j && t!=null){
                x++;
                t=t.next;
            }
        }



        return head;




    }
}
