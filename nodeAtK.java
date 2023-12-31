package BT;

public class nodeAtK {
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        //Your code goes here
        if(node==-1 || root==null || k<0){
            return;
        }

        int ans=printkdistanceNode(root,node,k);

    }




    static void printkdistanceNodeDown(BinaryTreeNode<Integer> node, int k){

        if (node == null || k < 0)
            return;

        if (k == 0)
        {
            System.out.print(node.data);
            System.out.println("");
            return;
        }

        printkdistanceNodeDown(node.left, k - 1);
        printkdistanceNodeDown(node.right, k - 1);
    }


    static int printkdistanceNode(BinaryTreeNode<Integer> node, int target, int k)
    {
        // Base Case 1: If tree is empty, return -1
        if (node == null){
            return -1;
        }


        if (node.data == target)
        {
            printkdistanceNodeDown(node, k);
            return 0;
        }

        int dl = printkdistanceNode(node.left, target, k);


        if (dl != -1)
        {


            if (dl + 1 == k)
            {
                System.out.print(node.data);
                System.out.println("");
            }

            else
                printkdistanceNodeDown(node.right, k - dl - 2);


            return 1 + dl;
        }


        int dr = printkdistanceNode(node.right, target, k);
        if (dr != -1)
        {
            if (dr + 1 == k)
            {
                System.out.print(node.data);
                System.out.println("");
            }
            else
                printkdistanceNodeDown(node.left, k - dr - 2);
            return 1 + dr;
        }

        return -1;
    }

}
