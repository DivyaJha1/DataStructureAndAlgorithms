package LinkedList;

public class evenAfterOdd {
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        //Your code goes here
        if(head==null){
            return head;
        }
        Node<Integer>oH=null;
        Node<Integer> eH=null;
        Node<Integer>oT=null;
        Node<Integer> eT=null;

        while(head!=null){
            if(head.data%2!=0){
                if(oH==null){
                    oH=head;
                    oT=head;


                }
                else{
                    oT.next=head;
                    oT=oT.next;

                }

            }
            else{
                if(eH==null){
                    eH=head;
                    eT=head;


                }
                else{
                    eT.next=head;
                    eT=eT.next;

                }
            }
            head=head.next;

        }
        if(oT!=null && eT!=null){
            oT.next=eH;
            eT.next=null;
        }
        if(oH==null){
            return eH;
        }
        return oH;

    }
}
