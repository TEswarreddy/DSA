package Strings;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static int minimumNumberOfSwaps(String s) {
        int balance = 0;
        int maxunbalance = 0;

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;
            } else {
                balance--;
            }
            maxunbalance = Math.min(maxunbalance, balance);
            
        }
        if(maxunbalance < 0) {
            return (Math.abs(maxunbalance)+1) / 2;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "]]][[[";
        System.out.println(minimumNumberOfSwaps(s)); 
    }
}