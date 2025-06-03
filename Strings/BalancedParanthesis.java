package Strings;

public class BalancedParanthesis {
    public static int balanceGates(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else{
                count--;
            }
            if(count==-1)
            {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        String s="(())";
        int res=balanceGates(s);
        if(res==-1)
        {
            System.out.println(res);
        }
        else{
            System.out.println(s.length()/2);
        }
    }
}
