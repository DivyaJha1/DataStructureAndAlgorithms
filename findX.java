package Trees;

public class findX {

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        // Write your code here
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        boolean ans=false;
        for (int i = 0; i < root.children.size(); i++) {
            if(checkIfContainsX(root.children.get(i), x)){
                return true;
            }

        }
        return ans;

    }
}
