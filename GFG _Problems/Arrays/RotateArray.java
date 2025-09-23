package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static int findgcd(int a,int b){  //Euclidean Algorithm to find the Greatest Common Divisor (GCD) of two numbers a and b
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String args[]){ //Juggling Algorith
        int arr[]={1, 2, 3, 4, 5};
        int d=2;
        int n=arr.length;
        int cycle=findgcd(n,d);
        System.out.println(cycle);
        for(int i=0;i<cycle;i++){
            int curr=i,next;
            
            int element=arr[i];
            while(true){
                next=(curr+d)%n;
                if(next==i) break;
                arr[curr]=arr[next];
                curr=next;
                //System.out.println(Arrays.toString(arr));
                
                
            }
            arr[curr]=element;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
