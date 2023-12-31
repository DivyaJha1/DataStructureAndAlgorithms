package Trees;

import java.util.LinkedList;

public class printLevelwise {
    public static void printLevelWise(TreeNode<Integer> root){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print output and don't return it.
         * Taking input is handled automatically.
         */
        int curlevel = 1;
        int nextlevel = 0;

        LinkedList<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
        queue.add(root);

        while(!queue.isEmpty()) {
            TreeNode<Integer> node = queue.remove(0);

            if (curlevel == 0) {
                System.out.println();
                curlevel = nextlevel;
                nextlevel = 0;
            }

            for(TreeNode<Integer> n : node.children) {
                queue.addLast(n);
                nextlevel++;
            }

            curlevel--;
            System.out.print(node.data + " ");
        }

    }
}
