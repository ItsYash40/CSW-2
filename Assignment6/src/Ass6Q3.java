class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Ass6Q3 {

    public boolean isBST(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        
        return isBST(node.left, min, node.val) && isBST(node.right, node.val, max);
    }

    public static void main(String[] args) {
    	Ass6Q3 tree = new Ass6Q3();

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);

        if (tree.isBST(root, null, null)) {
            System.out.println("The binary tree is a Binary Search Tree (BST).");
        } else {
            System.out.println("The binary tree is NOT a Binary Search Tree (BST).");
        }
    }
}


/*Determine if agiven binary tree is a binary search tree. You will use an isBST method which takes the maximum and minimum range
 *  of the values of the nodes. Make a Java program.*/
