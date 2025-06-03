package Arrays;

import java.util.Stack;
import java.util.Arrays;
public class DailyTemperatures {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i])
            {
                stack.pop();
            }
            result[i]= stack.isEmpty() ? 0 : stack.peek()-i;
            stack.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {73,74,75,71,69,72,76,73};
        int[] result = nextGreaterElement(nums);
        System.out.println(Arrays.toString(result));
        
    }
}

