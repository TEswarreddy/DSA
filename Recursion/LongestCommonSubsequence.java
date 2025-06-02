package Recursion;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String s1,int i, String s2,int j) {
        if(j >= s2.length() || i >= s1.length()) {
            return 0;
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1 + longestCommonSubsequence(s1, i + 1, s2, j + 1);
        } else {
            
            return Math.max(longestCommonSubsequence(s1, i+1, s2, j),longestCommonSubsequence(s1, i, s2, j+1));
        }
    }
    public static void main(String[] args)
    {
        String s1 = "abdace";
        String s2 = "babce";
        int result = longestCommonSubsequence(s1,0, s2,0);
        System.out.println("Length of Longest Common Subsequence: " + result);
    }

    
}
