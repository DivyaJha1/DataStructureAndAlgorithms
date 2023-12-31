package BT;

public class levelOrder {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            print(root, i);
            System.out.println();
        }
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;

        int l = height(root.left);
        int r= height(root.right);

        if (l > r)
            return (l + 1);
        else
            return (r + 1);

    }

    public static void print(BinaryTreeNode<Integer> root, int n) {
        if (root == null)
            return;
        if (n == 1) {
            System.out.print(root.data + " ");
        } else if (n > 1) {
            print(root.left, n - 1);
            print(root.right, n - 1);
        }
    }
}
