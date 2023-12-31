package BT;

public class nodePresent {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root==null){
            return false;
        }
        return (root.data==x) || isNodePresent(root.left, x)|| isNodePresent(root.right, x);
    }

}
