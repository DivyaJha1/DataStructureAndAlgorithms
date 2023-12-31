package LinkedList;

/*class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
*/
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}