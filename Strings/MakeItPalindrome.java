package Strings;

public class MakeItPalindrome {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        String s="abcd";
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                break;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        if(sb.length()==0)
        {
            System.out.println("-1");
        }
        else
        {
            
            sb.reverse();
            System.out.println(sb);
        }

    }
}
