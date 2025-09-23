package Arrays;

import java.util.Collections;
import java.util.Vector;

public class PlusOne {
    public static void main(String args[]){
        int arr[]={1,2,4};
        Vector<Integer> res=new Vector<>();
        int carry=1;
        for(int i=arr.length-1;i>=0;i--){
            int sum=arr[i]+carry;
            res.add(sum%10);
            carry=sum/10;
        }
        if(carry>0){
            res.add(carry);
        }
        Collections.reverse(res);
        System.out.println(res);
    }
}
