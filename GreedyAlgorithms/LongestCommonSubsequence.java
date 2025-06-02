package GreedyAlgorithms;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(int[][] lcs,String s1,int i, String s2,int j) {
        if(j ==0 || i == 0) {
            return 0;
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            lcs[i][j] =1 + longestCommonSubsequence(lcs,s1, i - 1, s2, j - 1);
        } else {
            
            lcs[i][j]= Math.max(longestCommonSubsequence(lcs,s1, i-1, s2, j),longestCommonSubsequence(lcs,s1, i, s2, j-1));
        }
        return lcs[i][j];
    }
    public static void main(String[] args)
    {
        String s1 = "abdace";
        String s2 = "babce";
        int lcs[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++) {
            for(int j=0;j<=s2.length();j++) {
                lcs[i][j]=0;
            }
        }
        int result = longestCommonSubsequence(lcs,s1,s1.length(), s2,s2.length());
         // Print the LCS matrix for debugging
        System.out.println("Length of Longest Common Subsequence: " + result);
    }

    
}
