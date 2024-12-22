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
    void find(int pos)
    {
        int count=1;
        Node temp=head;
        while(temp!=null)
        {
           if(count==pos)
           {
               System.out.println(temp.val);
           }
           count++;
           temp=temp.next;
        }
    }
}
class Main
{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      LL l=new LL();
      for(int i=0;i<n;i++)
      {
          l.insert(sc.nextInt());
      }
      int pos=sc.nextInt();
      l.find(pos);
  }
}
