package BST;

public class largestBST {
    public static class BSTreturn{

        int min,
                max,
                height;
        boolean isBST;

    }
    public static BSTreturn helper(BinaryTreeNode<Integer> root){
        if(root==null){

            BSTreturn ans=new BSTreturn();
            ans.min=Integer.MAX_VALUE;
            ans.max=Integer.MIN_VALUE;
            ans.height=0;
            ans.isBST=true;
            return ans;
        }


        BSTreturn Left = helper(root.left);
        BSTreturn Right = helper(root.right);

        if(!(Left.isBST && Left.max < root.data)){
            Left.isBST=false;
        }

        if(!(Right.isBST && Right.min > root.data)){
            Right.isBST=false;
        }


        if(!Left.isBST || !Right.isBST ||  root.data >Right.min ||  root.data <Left.max){
            if(Left.height>Right.height){
                Left.isBST=false;
                return Left;

            }

            else{
                Right.isBST=false;
                return Right;
            }

        }
        BSTreturn ans=new BSTreturn();
        ans.isBST=true;
        ans.min=Math.min(Left.min,Math.min(root.data,Right.min));
        ans.max=Math.max(Left.max,Math.max(root.data,Right.max));
        ans.height=Math.max(Left.height,Right.height)+1;
        return ans;



    }
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        return helper(root).height;
    }

}
