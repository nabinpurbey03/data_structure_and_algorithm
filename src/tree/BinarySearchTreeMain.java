package tree;

/**
 * The type Bst node.
 */
class BSTNode {
    /**
     * The Info.
     */
    int info;

    /**
     * Instantiates a new Bst node.
     *
     * @param info the info
     */
    public BSTNode(int info) {
        this.info = info;
    }

    /**
     * The Left.
     */
    BSTNode left, /**
     * The Right.
     */
    right;
}

/**
 * The type Binary search tree.
 */
class BinarySearchTree {
    private BSTNode root;

    private BSTNode insert(BSTNode node, int data) {
        if (node == null) {
            node = new BSTNode(data);
        } else if (data < node.info) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    /**
     * Insert.
     *
     * @param data the data
     */
    public void insert(int data) {
        root = insert(root, data);
    }

    private void preorderTraverse(BSTNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorderTraverse(root.left);
        preorderTraverse(root.right);
    }

    /**
     * Preorder traverse.
     */
    public void preorderTraverse() {
        preorderTraverse(root);
    }

    private void postorderTraverse(BSTNode root) {
        if (root == null) {
            return;
        }
        preorderTraverse(root.right);
        preorderTraverse(root.left);
        System.out.print(root.info + " ");
    }

    /**
     * Postorder traverse.
     */
    public void postorderTraverse() {
        postorderTraverse(root);
    }

    private void inorderTraverse(BSTNode root) {
        if (root == null) {
            return;
        }
        preorderTraverse(root.left);
        System.out.print(root.info + " ");
        preorderTraverse(root.right);
    }

    /**
     * Inorder traverse.
     */
    public void inorderTraverse() {
        inorderTraverse(root);
        System.out.println(root.info);
    }

    private BSTNode search(BSTNode root, int key) {
        if (root == null) {
            return null;
        } else if (key == root.info) {
            return root;
        } else if (key < root.info) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /**
     * Search boolean.
     *
     * @param data the data
     * @return the boolean
     */
    public boolean search(int data) {
        root = search(root, data);
        if (data == root.info) {
            return true;
        } else {
            return false;
        }
    }

}

/**
 * The type Binary search tree main.
 */
public class BinarySearchTreeMain {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(8);
        tree.preorderTraverse();
        System.out.println();
        tree.postorderTraverse();
        System.out.println();
        tree.inorderTraverse();
        System.out.println();
        System.out.println(tree.search(12));
    }
}
