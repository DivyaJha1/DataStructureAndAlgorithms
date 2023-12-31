package BT;

public class treeConstructionIPo {
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        //Your code goes here
        return build(inOrder, postOrder, 0, inOrder.length-1,0,postOrder.length-1);
    }

    public static BinaryTreeNode<Integer> build(int[] inOrder, int[] postOrder, int iStart,int iEnd, int pStart, int pEnd) {
        //Your code goes here
        if(iStart>iEnd){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(postOrder[pEnd]);
        if(iStart==iEnd){
            return root;
        }

        int idx=searchElementIndex(inOrder,iStart,iEnd,root.data);
        root.left=build(inOrder, postOrder, iStart, idx-1,pStart,idx-1+pStart-iStart);
        root.right=build(inOrder, postOrder, idx+1, iEnd,idx+pEnd-iEnd, pEnd-1);
        return root;



    }


    public static int searchElementIndex(int[] inOrder, int start, int end, int rootData){
        int x=0;
        for(int i=0; i<inOrder.length;i++){
            if(inOrder[i]==rootData){
                x=i;
                break;
            }
        }
        return x;
    }
}
