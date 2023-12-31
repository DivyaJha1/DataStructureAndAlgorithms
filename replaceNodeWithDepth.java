package Trees;

public class replaceNodeWithDepth {
    public static void replaceWithDepthValue(TreeNode<Integer> root){

        // Write your code here
        replaceWithDepth(root, 0);
    }

    static void replaceWithDepth(TreeNode<Integer> root, int depth){

        root.data = depth;
        for (int i = 0; i < root.children.size(); i++) {
            replaceWithDepth(root.children.get(i), depth + 1);
        }
    }
}
