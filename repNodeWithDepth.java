package BT;

public class repNodeWithDepth {
    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        changeToDepth(root, 0);
    }
    public static void changeToDepth(BinaryTreeNode<Integer> root, int depth) {
        //Your code goes here
        if(root==null){
            return;
        }
        root.data=depth;
        changeToDepth(root.left, depth+1);
        changeToDepth(root.right, depth+1);

    }
}
