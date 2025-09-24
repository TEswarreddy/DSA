package Arrays;

import java.util.Arrays;

public class RotateArray_189 {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
         k = k % n; // handle cases where k > n
        int step = n - k;  // convert right rotation into left rotation
        int cycle = gcd(step, n);
        
        for(int i=0;i<cycle;i++)
        {
            int curIndx=i,nextIndx;
            int starElement=arr[i];
            while(true){
                nextIndx=(curIndx+step)%n;
                if(nextIndx==i)
                    break;

                arr[curIndx]=arr[nextIndx];
                curIndx=nextIndx;
                
            }
            arr[curIndx]=starElement;

        }
        System.out.println(Arrays.toString(arr));

    }
}
