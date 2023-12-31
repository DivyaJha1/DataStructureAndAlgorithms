package BT;

public class treeConstructionIP {
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        return buildTreeHelper(preOrder, inOrder,0,preOrder.length-1,0,preOrder.length-1);
    }
    public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int[] inOrder,int preStart,int preEnd,int inStart,int inEnd) {
        //Your code goes here
        if(preStart>preEnd || inStart>inEnd){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preOrder[preStart]);

        int idx=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inOrder[i]==preOrder[preStart]){
                idx=i;
                break;
            }

        }
        root.left=buildTreeHelper(preOrder, inOrder,preStart+1,preStart+(idx-inStart),inStart,idx-1);
        root.right=buildTreeHelper(preOrder, inOrder,preStart+(idx-inStart)+1,preEnd,idx+1,inEnd);
        return root;

    }
}
