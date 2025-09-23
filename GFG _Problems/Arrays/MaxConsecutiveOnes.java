package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String args[]){
        int arr[]={0, 0, 0, 0};
        int maxcount=0;
        int count=1;
       
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                //System.out.print(count);
                
                count++;
                
            }else{
                
                if(count>maxcount){
                    maxcount=count;
                }
                count=1;
            }

        }
        maxcount=count>maxcount ? count:maxcount;
        System.out.println(maxcount);
    }
}
