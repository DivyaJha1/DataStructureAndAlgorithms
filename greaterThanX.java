package BT;

public class greaterThanX {
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root==null){
            return 0;
        }
        if(root.data>x){
            return 1+countNodesGreaterThanX(root.left, x)+countNodesGreaterThanX(root.right, x);
        }
        return countNodesGreaterThanX(root.left, x)+countNodesGreaterThanX(root.right, x);
    }
}
