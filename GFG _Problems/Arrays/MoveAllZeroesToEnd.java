package Arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String args[]){
        //int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        // int arr2[]=new int [arr.length];             //Navie approach
        // for(int i=0,j=0,k=arr.length-1;i<arr.length;i++)
        // {
        //     if(arr[i]!=0){
        //         arr2[j]=arr[i];
        //         j++;
        //     }
        //     else{
        //         arr2[k]=0;
        //         k--;
        //     }
        // }
        // System.out.println(Arrays.toString(arr2));

        // onr traversal

        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
