package Arrays;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayLeaders {
   public static void main(String args[]){
    int arr[]={61, 61, 17};
    ArrayList<Integer> al=new ArrayList<>();
    
    int max=0;
    for(int i=arr.length-1;i>=0;i--){
        if(arr[i]>=max){
            al.add(arr[i]);
            max=arr[i];
        }   
    }
    Collections.reverse(al);
    System.out.println(al);
    } 
    
}

