package BST;

public class LCA {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null){
            return -1;
        }

        if (root.data > a && root.data > b){
            return getLCA(root.left,a,b);
        }


        if (root.data < a && root.data < b){
            return getLCA(root.right, a,b);
        }

        return root.data;

    }
}
