// You are using Java
import java.util.*;
class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val=val;
    }
}
class LL
{
    Node head;
    LL()
    {
        head=null;
    }
    void insert(int val)
    {
        if(head==null)
        {
            Node newnode=new Node(val);
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            Node newnode=new Node(val);
            temp.next=newnode;
        }
    }
    void startPos(int pos)
    {
        Node temp=head;
        int count=1;
        //Node temp1=head;
        Node startNode=null;
        while(temp!=null)
        {
            if(count==pos)
            {
                startNode=temp;
            }
            count++;
            temp=temp.next;
        }
        temp=head;
        count=1;
        Node lastNode=null;
        while(temp.next!=null)
        {
            if(count==pos-1)
            {
                lastNode=temp;
            }
            count++;
            temp=temp.next;
        }
        lastNode.next=null;
        temp.next=head;
        head=startNode;
        
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL l=new LL();
        
        for(int i=0;i<n;i++)
        {
            l.insert(sc.nextInt());
        }
        int pos =sc.nextInt();
        l.startPos(pos);
        l.display();
    }
}
