// Find number of nodes in Binary Search Tree without using counter variable only using recursion
class Node 
{
    int val;
    Node left;
    Node right;
    Node(int val)
    {
        this.val=val;
    }
}
class BinaryTree
{
    Node root;
    void insert(int val)
    {
        root=insertNode(root,val);
    }
    Node insertNode(Node root,int val)
    {
        if(root==null)
        {
            root=new Node(val);
        }
        else if(val<root.val)
        {
            root.left=insertNode(root.left,val);
        }
        else
        {
            root.right=insertNode(root.right,val);
        }
        return root;
    }
    
    int  countNode(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1+countNode(root.left)+countNode(root.right);
    }
    
    
}

class Main 
{
    public static void main(String args[])
    {
        BinaryTree bt=new BinaryTree();
        bt.insert(7);
        bt.insert(8);
        bt.insert(4);
        bt.insert(12);
        bt.insert(5);
        int c=bt.countNode(bt.root);
        System.out.println(c);
    }
}
