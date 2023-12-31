package BT;

import java.util.LinkedList;
import java.util.Queue;

public class printLevelWise {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> currentNode = queue.poll();
            System.out.print(currentNode.data + ":L:");

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
                System.out.print(currentNode.left.data + ",R:");
            } else {
                System.out.print("-1,R:");
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
                System.out.println(currentNode.right.data);
            } else {
                System.out.println("-1");
            }
        }

    }
}
