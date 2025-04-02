class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int info) {
        this.info = info;
        this.left = this.right = null;
    }
}

class Ass6Q1 {
    private BSTNode root;

    public Ass6Q1() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private BSTNode insertRec(BSTNode root, int value) {
        if (root == null) {
            root = new BSTNode(value);
            return root;
        }
        if (value < root.info) {
            root.left = insertRec(root.left, value);
        } else if (value > root.info) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void preorderTraversal() {
        System.out.print("Preorder: ");
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(BSTNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void inorderTraversal() {
        System.out.print("Inorder: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.info + " ");
            inorderRec(root.right);
        }
    }

    public void postorderTraversal() {
        System.out.print("Postorder: ");
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(BSTNode root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.info + " ");
        }
    }

    public static void main(String[] args) {
    	Ass6Q1 bst = new Ass6Q1();

        int[] values = {8, 3, 10, 1, 6, 14, 4,7,13};
        for (int value : values) {
            bst.insert(value);
        }

        bst.preorderTraversal();
        bst.inorderTraversal();
        bst.postorderTraversal();
    }
}




/*Design a class BSTnode in Java with  member variables info to store an integer and two refernence 
 s left and right
 to reprsent its left and right children. Implement a constructor to initialize those attributes.
 Develope a method  to insert a node while maintaining the property of a binary search tree .
 Extends this implementation by adding methods for traversal the tree using preOrder, PostOrder, InOrder
 techniques. Finally and a main method to crate a binary search tree , insert multiple nodes , and 
 invoke the traversal method to display the tree structure.  */
