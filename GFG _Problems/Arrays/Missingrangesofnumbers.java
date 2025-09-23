package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Missingrangesofnumbers {
    public static void main(String args[]){
        int arr[]={-48, -10, -6, -4, 0, 4, 17};
        int lower=-54,upper=17;
        List<List<Integer>> outer=new ArrayList<>();
        if(lower<arr[0]){
            List<Integer> inner=new ArrayList<>();
            inner.add(lower);
            inner.add(arr[0]-1);
            outer.add(inner);
        }
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]>1){
                List<Integer> inner=new ArrayList<>();
                inner.add(arr[i]+1);
                inner.add(arr[i+1]-1);
                outer.add(inner);
            }
        }
        if(upper>arr[arr.length-1]){
            List<Integer> inner=new ArrayList<>();
        
            inner.add(arr[arr.length-1]+1);
            inner.add(upper);
            outer.add(inner);
        }
        System.out.println(outer);
    }
     
}
