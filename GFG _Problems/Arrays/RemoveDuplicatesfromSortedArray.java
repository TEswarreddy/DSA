package Arrays;

import java.util.ArrayList;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String args[]){
        int arr[]={1, 2, 2, 3, 4, 4, 4, 5, 5};
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1])
            {
                al.add(arr[i]);
            }
        }
        System.out.println(al);
    }
}
