package LinkedList;

public class FindRecursively {
    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        if(head==null){
            return -1;
        }
        return findIdx(head, n, 0);
    }
    public static int findIdx(Node<Integer> head, int n,int idx) {
        //Your code goes here
        if(head==null){
            return -1;
        }
        if(head.data==n){
            return idx;
        }
        return findIdx(head.next, n, idx+1);
    }
}
