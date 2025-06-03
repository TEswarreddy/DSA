package Strings;
import java.util.HashMap;
import java.util.Map;

public class GameOfThrones {
    public static boolean anagramPalindrome(String s)
    {
        Map<Character, Integer> charCount = new HashMap<Character,Integer>();
        for(char c:s.toCharArray())
        {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for(int count : charCount.values())
        {
            if(count % 2 != 0)
            {
                oddCount++;
            }
        }
        if(oddCount > 1)
        {
            return false; // More than one character with an odd count means it can't form a palindrome
        }
        return true; // At most one character with an odd count means it can form a palindrome
    }
    public static void main(String[] args)
    {
        String s = "aaabbbb";
        System.out.println(anagramPalindrome(s));
    }
}
