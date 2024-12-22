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
    void reverse()
    {
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null)
        {
            next= cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }
    void display(int n)
    {
        Node temp=head;
        int x=n/2;
        if(n%2==0)
        {
            int c=0;
            while(temp!=null)
            {
                c++;
                System.out.print(temp.val+" ");
                temp=temp.next;
                if(c==x)
                {
                    break;
                }
            }
            System.out.println();
            while(temp!=null)
            {
                
                System.out.print(temp.val+" ");
               temp=temp.next;
            }
            
        }
        else
        {
            int c=0;
            while(temp!=null)
            {
                c++;
                System.out.print(temp.val+" ");
                temp=temp.next;
                if(c==x+1)
                {
                    break;
                }
            }
            System.out.println();
            while(temp!=null)
            {
                
                System.out.print(temp.val+" ");
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
        int  n = sc.nextInt();
        LL l=new LL();
        for(int i=0;i<n;i++)
        {
            l.insert(sc.nextInt());
        }
        l.reverse();
        l.display(n);
        
    }
}
