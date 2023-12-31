package Trees;

public class height {
    public static int getHeight(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int height=0;
        for(TreeNode<Integer> child: root.children){
            int childHeight=getHeight(child);
            height=Math.max(height,childHeight);
        }
        height++;
        return height;
    }
}
