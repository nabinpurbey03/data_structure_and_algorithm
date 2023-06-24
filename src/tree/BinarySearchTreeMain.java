package tree;

import java.util.PrimitiveIterator;

class BSTNode {
    int info;

    public BSTNode(int info) {
        this.info = info;
    }

    BSTNode left,
    right;
}

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

    public void inorderTraverse() {
        inorderTraverse(root);
    }

    private boolean search(BSTNode root, int key) {
        if (root == null) {
            return false;
        } else if (key == root.info) {
            return true;
        } else if (key < root.info) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private BSTNode delete(BSTNode node, int data){
        if(data <node.info){
            node.left = delete(node.left, data);
        } else if (data>node.info) {
            node.right = delete(node.right, data);
        }else {

            //case-1
            if(node.left == null && node.right == null){
                return null;
            }

            //case-2
            if (node.left == null) {
                return node.right;
            }else if (node.right == null){
                return node.left;
            }

            //case-3
            BSTNode IS = inorderSuccessor(node.right);
            node.info = IS.info;
            node.right = delete(node.right, IS.info);
        }
        return node;
    }
    private BSTNode inorderSuccessor(BSTNode node){
        while (node.left != node){
            node = node.left;
        }
        return node;
    }

}

public class BinarySearchTreeMain {
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
        System.out.println(tree.search(2));
    }
}
