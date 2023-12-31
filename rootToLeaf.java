package BT;

public class rootToLeaf {
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        rootToLeafPathsSum(root, k, "");
    }

    public static void rootToLeafPathsSum(BinaryTreeNode<Integer> root, int k, String str) {
        //Your code goes here
        if(root==null){
            return;
        }
        if( k==root.data && root.left==null && root.right==null){
            System.out.println(str+Integer.toString(root.data));
        }

        rootToLeafPathsSum(root.left, k-root.data, str+Integer.toString(root.data)+" ");
        rootToLeafPathsSum(root.right, k-root.data, str+Integer.toString(root.data)+" ");



    }
}
