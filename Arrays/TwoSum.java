package Arrays;

public class TwoSum {
    public static void twosum(int[] nums,int target){
        int i=0;
        int j=nums.length-1;
        while(i<nums.length)
        {
            if(nums[i]+nums[j]==target){
                System.out.println("Indices: " + i + " and " + j);
                return;
            }
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
    }
    public static void main(String[] args)
    {
        int nums[] = {3,3,};
        int target = 6;
        twosum(nums, target);
    }
}
