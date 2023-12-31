package BST;

import java.util.ArrayList;

public class getPath {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if(root==null){
            return null;
        }
        if(ans(root, data)){
            if(root.data==data){
                ArrayList<Integer> ans=new ArrayList<Integer>();
                ans.add(root.data);
                return ans;
            }

            else if(root.data>data){
                ArrayList<Integer> ans=getPath(root.left, data);
                ans.add(root.data);
                return ans;
            }
            else{
                ArrayList<Integer> ans=getPath(root.right, data);
                ans.add(root.data);
                return ans;
            }
        }
        else{
            return null;
        }


    }

    public static boolean ans(BinaryTreeNode<Integer> root, int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        return ans(root.left,data)||ans(root.right, data);
    }
}
