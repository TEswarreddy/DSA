import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    // public static int lengthOfLongestSubstring(String s) {
        
    //     int n=s.length();
    //     if(s.equals(" ")) return 1;
    //     if (n == 0) return 0;
    //     Set<Character> set=new HashSet<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         System.out.println("Current character: " + s.charAt(i));
    //         char c=s.charAt(i);
    //         set.add(c);
    //     }
    //     return set.size();
        
    // }
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int l=0;
        int h=0;
        while(h<s.length()){
            if(!set.contains(s.charAt(h))){
                set.add(s.charAt(h));
                maxLength=Math.max(maxLength,h-l+1);
                h++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}