// Finding number of nodes in BinaryTree using count variable
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
    int count()
    {
        
        return countNode(root,0);
    }
    int  countNode(Node root,int count)
    {
        if(root == null)
        {
            return count;
        }
        count++;
        count=countNode(root.left,count);
        count=countNode(root.right,count);
        return count;
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
        int c=bt.count();
        System.out.println(c);
    }
}
