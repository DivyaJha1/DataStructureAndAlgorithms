package Trees;

public class identicalStructure {
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        // Write your code here
        if(root1==null){
            if(root2==null){
                return true;
            }
            else{
                return false;
            }
        }

        if(root1.data != root2.data){
            return false;
        }

        if(root1.children.size() != root2.children.size()){
            return false;
        }
        for(int i=0; i<root1.children.size(); i++){
            if(!checkIdentical(root1.children.get(i),root2.children.get(i))){
                return false;
            }
        }
        return true;
    }
}
