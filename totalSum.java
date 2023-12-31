package BT;

public class totalSum {
    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.
        if(root==null){
            return 0;
        }
        return root.data + getSum(root.left) +getSum(root.right);
    }
}
