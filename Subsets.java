import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsetsHelper(int[] nums) {
        int n = nums.length;
        int totalSubsets = 1 << n; 
        List<List<Integer>> sol= new ArrayList<>();

        for (int i = 0; i < totalSubsets; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) { 
                    sub.add(nums[j]);
                }
            }
            sol.add(sub);   
        }
        return sol;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res= subsetsHelper(nums);
        System.out.println("Subsets: " + res);
    }
}
