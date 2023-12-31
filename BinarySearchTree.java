package BST;

/*
 * Binary Tree Node class
 *
 * class BinaryTreeNode<T> {
 * 		T data;
 * 		BinaryTreeNode<T> left;
 * 		BinaryTreeNode<T> right;
 * 		public BinaryTreeNode(T data)
 * 		{
 * 			this.data = data;
 * 		}
 * }
 */

/*
 * Main Method being used internally
 *	public static void main(String[] args) throws IOException {
 *		BinarySearchTree bst = new BinarySearchTree();
 *		int choice, input;
 *		int q = Integer.parseInt(br.readLine());
 *		while (q-- > 0) {
 *			st = new StringTokenizer(br.readLine());
 *			choice = Integer.parseInt(st.nextToken());
 *			switch (choice) {
 *			case 1:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.insert(input);
 *				break;
 *				case 2:
 *				input = Integer.parseInt(st.nextToken());
 *				bst.remove(input);
 *				break;
 *			case 3:
 *				input = Integer.parseInt(st.nextToken());
 *				System.out.println(bst.search(input));
 *				break;
 *			default:
 *				bst.printTree();
 *				break;
 *			}
 *		}
 *	}
 */

public class BinarySearchTree {
    private static BinaryTreeNode<Integer> node;

    public void insert(int data) {
        //Implement the insert() function
        if(data==-1){
            return;
        }
        node=insert(node, data);



    }
    public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            BinaryTreeNode<Integer> newRoot=new BinaryTreeNode<Integer>(x);
            return newRoot;
        }
        if(x>root.data){
            root.right=insert(root.right, x);
        }
        else{
            root.left=insert(root.left, x);
        }
        return root;
    }

    public void remove(int data) {
        //Implement the remove() function

        if(!search(data)){
            return;
        }
        else{
            node=delete(node,data);
        }
    }

    private static BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root,int key){
        if (root == null){
            return root;
        }


        if (key < root.data){
            root.left = delete(root.left, key);
        }
        else if (key > root.data){
            root.right = delete(root.right, key);
        }
        else {

            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }


            root.data = minimumValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public static int minimumValue(BinaryTreeNode<Integer> root){
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }



    public void printTree() {
        //Implement the printTree() function
        print(node);

    }

    private static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            System.out.println(root.data+":");
        }
        else if(root.left!=null && root.right!=null){
            System.out.println(root.data+":L:"+root.left.data+",R:"+root.right.data);
        }
        else if(root.left!=null){
            System.out.println(root.data+":L:"+root.left.data+",");
        }
        else{
            System.out.println(root.data+":R:"+root.right.data);
        }





        print(root.left);
        print(root.right);



    }

    public boolean search(int data) {
        //Implement the search() function

        return searchHelper(node, data);
    }
    private static boolean searchHelper(BinaryTreeNode<Integer>root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }

        if(root.data>x){
            return searchHelper(root.left, x);
        }
        else{
            return searchHelper(root.right, x);
        }
    }




}