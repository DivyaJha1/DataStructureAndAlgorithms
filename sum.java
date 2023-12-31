package Trees;

public class sum {
    public static int sumOfAllNode(TreeNode<Integer> root){
        int sum=0;
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child=root.children.get(i);
            int childSum=child.data+sumOfAllNode(child);
            sum+=childSum;
        }
        return sum;

    }
}
