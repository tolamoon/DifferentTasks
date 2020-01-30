package binarytree;

class BinarySearchTree {
    private Node root;

    private boolean checkBST(Node root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkBST(Node root, int left, int right){
        if(root == null)
            return true;
        if(root.data <= left || root.data >= right)
            return false;

        return checkBST(root.left, left, root.data) && checkBST(root.right, root.data, right);
    }

    private Node searchKey(Node root, int key){
        if(root == null || root.data == key)
            return root;
        if(key < root.data){
            //System.out.print(root.data);
            return searchKey(root.left, key);
        }
        else {
            //System.out.println(root.data);
            return searchKey(root.right, key);
        }
    }

    void insert(int key) {
        root = insertRecursive(root, key);
    }

    private Node insertRecursive(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data) {
            root.left = insertRecursive(root.left, key);
            //System.out.println(root.left.data);
            return root.left;
        } else if(key > root.data){
            root.right = insertRecursive(root.right, key);
            //System.out.println(root.right.data);
            return root.right;
        }
        return root;
    }

    private void inorderPrint()  {
        inorderRecursive(root);
    }

    private void inorderRecursive(Node root) {
        if (root != null) {
            //first recur on left child
            inorderRecursive(root.left);
            System.out.print(root.data+" ");
            inorderRecursive(root.right);
        }
    }

    private void preorderPrint() {
        preorderRecursive(root);
    }

    private void preorderRecursive(Node root) {
        if(root != null){
            //first print data of node
            System.out.print(root.data+" ");
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
    }

    private void postorderPrint(){
        postorderRecursive(root);
    }

    private void postorderRecursive(Node root){
        if(root != null){
            //first recur on right child
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            System.out.print(root.data+" ");
        }
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
            System.out.println("Is BST.\n");
        } else {
            System.out.println("Not BST.\n");
        }

        System.out.println( "Inorder Traversal: ");
        bst.inorderPrint();
        System.out.println( "\nPreorder Traversal: ");
        bst.preorderPrint();
        System.out.println( "\nPostorder(bottom-up) Traversal: ");
        bst.postorderPrint();

        //System.out.println( "\nSearch key in BST: ");
        bst.searchKey(bst.root, 7);
    }
}