package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelWiseLL {
    /*
     * BinaryTreeNode class
     *
     * class BinaryTreeNode<T>
     * {
     * 		T data;
     * 		BinaryTreeNode<T> left;
     * 		BinaryTreeNode<T> right;
     *		public BinaryTreeNode(T data)
     *		{
     *  		this.data = data;
     *  	}
     *  }
     */
    /*
     * LinkedListNode Class
     * class LinkedListNode<T>
     * {
     * 		T data;
     * 		LinkedListNode<T> next;
     * 		public LinkedListNode(T data)
     * 		{
     *  		this.data = data;
     *  	}
     *  }
     */
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        // Write your code here
        ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            LinkedListNode level = new LinkedListNode<>(0);
            LinkedListNode head = null;

            while(size-- > 0){
                BinaryTreeNode temp = q.poll();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }

                if(head == null){
                    LinkedListNode newNode = new LinkedListNode<>(temp.data);
                    level=newNode;
                    head = newNode;
                }
                else{
                    LinkedListNode newNode = new LinkedListNode<>(temp.data);
                    level.next=newNode;
                    level=level.next;
                }
            }
            ans.add(head);
        }

        return ans;
    }

}
