package BT;

public class diameter {
    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        if(root==null){
            return 0;
        }
        return maxHeight(root.left)+maxHeight(root.right)+1;
    }

    public static int maxHeight(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        return Math.max(maxHeight(root.left), maxHeight(root.right))+1;
    }


}
