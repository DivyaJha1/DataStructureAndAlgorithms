package BST;

import java.util.Arrays;

public class createBST {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        Arrays.sort(arr);
        if(arr.length==0){
            return null;
        }
        if(arr.length==1){
            BinaryTreeNode<Integer> x=new BinaryTreeNode<Integer>(arr[0]);
            return x;
        }
        BinaryTreeNode<Integer> b=toBST(arr, 0, arr.length-1);
        return b;


    }

    public static BinaryTreeNode<Integer> toBST(int[] arr,int s, int n) {
        if(s>n){
            return null;
        }
        int mid=(s+n)/2;
        BinaryTreeNode<Integer> x=new BinaryTreeNode<Integer>(arr[mid]);
        x.left=toBST(arr, s,mid-1);
        x.right=toBST(arr, mid+1, n);
        return x;

    }
}
