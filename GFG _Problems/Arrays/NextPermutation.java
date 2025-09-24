package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void swap(int arr[], int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
    public static void reverse(int arr[],int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    public static void nextpermutation(int[] arr){
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr,0,n-1);
            return ;
        }

        for(int i=n-1;i>=0;i--){
            if(arr[pivot]<arr[i]){
                swap(arr,pivot,i);
                break;
            }
        }
        reverse(arr,pivot+1,n-1);
    
    }
    public static void main(String args[]){
        int arr[]={3, 4, 2, 5, 1};
        nextpermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
