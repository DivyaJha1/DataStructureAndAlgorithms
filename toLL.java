package BST;

public class toLL {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            LinkedListNode<Integer> b = new LinkedListNode<Integer>(root.data);
            return b;
        } else if (root.left == null) {
            LinkedListNode<Integer> m = new LinkedListNode<Integer>(root.data);
            LinkedListNode<Integer> r = constructLinkedList(root.right);
            m.next = r;
            return m;
        } else if (root.right == null) {
            LinkedListNode<Integer> m = new LinkedListNode<Integer>(root.data);
            LinkedListNode<Integer> l = constructLinkedList(root.left);
            LinkedListNode<Integer> temp = l;

            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            temp.next = m;
            return l;
        } else {

            LinkedListNode<Integer> m = new LinkedListNode<Integer>(root.data);
            LinkedListNode<Integer> r = constructLinkedList(root.right);
            m.next = r;

            LinkedListNode<Integer> l = constructLinkedList(root.left);
            LinkedListNode<Integer> temp = l;

            while (temp != null && temp.next != null) {
                temp = temp.next;
            }
            temp.next = m;


            return l;
        }
    }
}