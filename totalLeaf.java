package Trees;

public class totalLeaf {
    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        int count = 0;
        if(root == null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }
        for(TreeNode<Integer> child: root.children){
            count = count + countLeafNodes(child);
        }
        return count;

    }
}
