
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Ass6Q2 {
    Node root;

    public Node createTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node node = new Node(arr[mid]);

        node.left = createTree(arr, start, mid - 1); 
        node.right = createTree(arr, mid + 1, end);  

        return node;
    }

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);  
            System.out.print(root.data + " ");  
            inOrderTraversal(root.right);  
        }
    }

    public void createBST(int[] arr) {
        root = createTree(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Ass6Q2 bst = new Ass6Q2();
        
        bst.createBST(arr);

        System.out.println("In-order traversal of the BST:");
        bst.inOrderTraversal(bst.root);
    }
}


/*Construct a BST for the given elemets {10,20,30,40,50,60,70,80,90,100}. Include a method call CreateTree to construct the BST from sorting arrray. The methods takes an array of integers 
 * as  input and construct the tree recrusicvely using a binary search algorithm java program..  */
