package BT;

public class minMax {
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(root==null){
            Pair<Integer, Integer> p=new Pair<>(min,max);
            return p;
        }

        Pair<Integer, Integer> p=new Pair<>(min,max);
        if(root.data>p.maximum){
            p.maximum=root.data;
        }
        if(root.data<p.minimum){
            p.minimum=root.data;
        }
        Pair<Integer, Integer> t1=getMinAndMax(root.left);
        Pair<Integer, Integer> t2=getMinAndMax(root.right);

        Pair<Integer, Integer> ans=new Pair<>(Math.min(Math.min(t1.minimum, t2.minimum),p.minimum),Math.max(Math.max(t1.maximum, t2.maximum),p.maximum));

        return ans;

    }
}
