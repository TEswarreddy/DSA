class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
class BST{
    Node root;
    BST(){
        root=null;
    }

    void insert(int x) {
        root = insertNode(root, x);
    }
    Node insertNode(Node root,int data){
        if (root == null){
            return new Node(data);
        }
        if (data < root.data){
            root.left = insertNode(root.left, data);
        }
        else if(data > root.data){
            root.right = insertNode(root.right, data);
        }
        else{
            return root; // No duplicates allowed
        }
        return root;
    }
    void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    void preTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preTraversal(root.left);
        preTraversal(root.right);
    }
    void postTraversal(Node root) {
        if (root == null) {
            return;
        }
        postTraversal(root.left);
        postTraversal(root.right);
        System.out.print(root.data + " ");
    }
    int countLeafNodes(Node root){
      if(root == null){
        return 0;
      }
      if(root.left == null && root.right == null){
        return 1;
      }
      return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    int heightTree(Node root){
        if (root == null){
            return 0;
        }
        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        return (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;
    }
    int depthTree(Node root,int x){
        if (root == null){
            return -1;
        }
        if (root.data ==x){
            return 0;
        }
        if(x<root.data){
            int leftDepth = depthTree(root.left, x);
            return (leftDepth == -1) ? -1 : leftDepth + 1;
        } else {
            int rightDepth = depthTree(root.right, x);
            return (rightDepth == -1) ? -1 : rightDepth + 1;
        }
        
    }
                                                                            
}
public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);
        System.out.println("Inorder Traversal:");
        bst.inorderTraversal(bst.root);
        System.out.println("Preorder Traversal:");
        bst.preTraversal(bst.root);
        System.out.println("Postorder Traversal:");
        bst.postTraversal(bst.root);
        
        System.out.println("\nCount of Leaf Nodes: " + bst.countLeafNodes(bst.root));
        System.out.println("Height of Tree: " + (bst.heightTree(bst.root)-1));
        System.out.println("Depth of Node with value 4: " + bst.depthTree(bst.root, 4));
        System.out.println("Depth of Node with value 10: " + bst.depthTree(bst.root, 10));
        System.out.println("Depth of Node with value 2: " + bst.depthTree(bst.root, 3));
        System.out.println("Depth of Node with value 6: " + bst.depthTree(bst.root, 5));
    }

    
}
