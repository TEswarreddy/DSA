package Arrays;

import java.util.Arrays;

public class RotateArray_189_Using_Reversal_Algorithm {
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;

        int n=arr.length;
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}
