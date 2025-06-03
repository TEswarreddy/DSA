package Strings;

public class SplitStringInBalancedStrings {
    public static int balancedStringSplit(String s) {
        int substring=0;
        int count=0; 
        for(char c:s.toCharArray())
        {
            if(c=='R')
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==0)
            {
                substring++;
            }
        }
        return substring;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s)); 
    }
}
