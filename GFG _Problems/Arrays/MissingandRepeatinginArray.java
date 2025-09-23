package Arrays;

import java.util.ArrayList;

public class MissingandRepeatinginArray {
    public static void main(String args[]){
        int arr[]={4, 3, 6, 2, 1, 1};
        int n=arr.length;
        long s=(long)(n*(n+1))/2;
        long ssq=(long)(n*(n+1)*(2L*n+1))/6;

        for(int i=0;i<n;i++){
            s -=arr[i];
            ssq -=(long) arr[i]*arr[i];
        }
        int missing=(int)(s+ssq/s)/2;
        int repeating=(int)(missing-s);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(repeating);
        al.add(missing);
        System.out.println(al);
        
    }
}
