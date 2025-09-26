package Arrays;

public class MaximumProductofThreeNumbers_628 {
    public static  int maximumProduct(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];

            }else if(nums[i]>second && nums[i]!=first){
                third=second;
                second=nums[i];
            }else if(nums[i]>third && nums[i]!=first && nums[i]!=second){
                third=nums[i];
            }

            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];
            }

        }
        return Math.max(first*second*third,min1*min2*first);
                
    }
    public static void main(String args[]){
        int[] arr={1,2,3};
        int sol=maximumProduct(arr);
        System.out.println(sol); 
    }
}
