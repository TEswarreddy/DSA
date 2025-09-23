package Arrays;

public class ThirdLargestElement {
    public static void main(String args[]){
        int[] arr={855,450 ,132, 359 ,233 ,825 ,604, 481, 262, 337, 720 ,525, 652, 300, 906, 219 ,926, 906 ,293 ,864 ,817 ,498, 30 ,639, 661};
        int firstmax=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        int thirdmax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstmax){
                thirdmax=secondmax;
                secondmax=firstmax;
                firstmax=arr[i];
                
            }
            else if(arr[i]>secondmax ){
                thirdmax=secondmax;
                secondmax=arr[i];

            }else if(arr[i]>thirdmax ){
                thirdmax=arr[i];
            }
        }
        if(thirdmax==Integer.MIN_VALUE){
            System.out.println("-1");
        }else{
            System.out.println(thirdmax);
        }
    }
}
