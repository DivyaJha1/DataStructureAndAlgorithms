package BT;

public class addDup {
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> node= new BinaryTreeNode<Integer> (root.data);
        BinaryTreeNode<Integer> r=root.left;
        root.left=node;
        node.left=r;
        node.right=null;
        insertDuplicateNode(root.right);
        insertDuplicateNode(r);

    }
    
}
