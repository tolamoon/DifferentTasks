package binarytree;

public class BinarySearchTree{
    Node root;

    boolean checkBST(Node root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean checkBST(Node root, int left, int right){
        if(root == null)
            return true;
        if(root.data <= left || root.data >= right)
            return false;

        return checkBST(root.left, left, root.data) && checkBST(root.right, root.data, right);
    }

    public static void main(String[] args){

        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(4);
        bst.root.left = new Node(2);
        bst.root.right = new Node(6);
        bst.root.right.right = new Node(7);
        bst.root.right.left = new Node(5);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(3);

        if(bst.checkBST(bst.root)){
            System.out.println("Is BST.");
        } else {
            System.out.println("Not BST.");
        }
    }
}