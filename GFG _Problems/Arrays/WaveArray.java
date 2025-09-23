package Arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String args[]){
        int arr[]={2, 4, 7, 8, 9, 10};
        for(int i=0;i<arr.length-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
           
        }
        System.out.println(Arrays.toString(arr));
    }
}
