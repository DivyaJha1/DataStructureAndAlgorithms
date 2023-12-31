package BT;

public class height {
    public static int heightBT(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return 0;
        }
        return Math.max(heightBT(root.left),heightBT(root.right))+1;
    }

}
