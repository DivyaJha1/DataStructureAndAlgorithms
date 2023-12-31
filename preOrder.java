package BT;

public class preOrder {
    public static void preOrderBT(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preOrderBT(root.left);
        preOrderBT(root.right);

    }
}
