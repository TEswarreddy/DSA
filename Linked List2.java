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
            Node newnode = new Node(val);
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
    void reverse()
    {
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
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
    void swap(int a,int b)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.val==a)
            {
                temp.val=b;
                temp=temp.next;
            }
            
            else if(temp.val==b)
            {
                temp.val=a;
                temp=temp.next;
            }
            else
            {
                temp=temp.next;
            }
            
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        l.swap(a,b);
        l.reverse();
        l.display();
    }
}
