//Reverse of a Stack without using another Stack
//using recursion
import java.util.*;
class Main 
{
    static void insert(Stack<Integer> s,int temp)
    {
        if(s.isEmpty())
        {
            s.add(temp);
        }
        else{
            int x=s.pop();
            insert(s,temp);
            //System.out.println(s);
            s.add(x);
        }
    }
    static void recurs(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int temp=s.pop();
        recurs(s);
        insert(s,temp);
    }
    
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s);
        //Iterator it=s.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }
        recurs(s);
        // while(s.isEmpty())
        // {
        //     System.out.println(s.pop());
        // }
        System.out.println(s);
        
    }
}
