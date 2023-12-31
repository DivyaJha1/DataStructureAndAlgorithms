package LinkedList;

public class bubbleSort {
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null){
            return head;
        }
        for(int i=0;i<len(head)-1;i++){
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> next = curr.next;

            while(curr.next != null){
                if(curr.data > curr.next.data){
                    if(prev == null){
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    }else{
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }

    public static int len( LinkedListNode<Integer> h){
        int x=0;
        while(h!=null){
            x++;
            h=h.next;
        }
        return x;
    }
}
