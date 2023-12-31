package Trees;

public class nodesGreaterThanX {
    public static int numNodeGreater(TreeNode<Integer> root,int x){

        // Write your code here
        if(root==null){
            return 0;
        }
        int result = 0;
        if(root.data>x){
            result++;
        }

        for(int i=0; i< root.children.size(); i++){
            result += numNodeGreater(root.children.get(i), x);
        }
        return result;






    }
}
