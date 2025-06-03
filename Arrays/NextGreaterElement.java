package Arrays;
import java.util.Stack;
import java.util.Arrays;
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek()<nums[i])
            {
                stack.pop();
            }
            result[i]= stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,12,5,3,1,2,5,3,1,2,4,6};
        int[] result = nextGreaterElement(nums);
        System.out.println(Arrays.toString(result));
        
    }
}
