package Arrays;


import java.util.Arrays;

public class ReverseArrayinGroups {
    public static void main(String args[]){
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8};
        int k=3;
        int n=arr.length;
        
        for(int i=0;i<n;i+=k){
            int first=i;
            int last;
            if(i+k-1<n){
                last=i+k-1;
            }else{
                last=n-1;
            }
            while(first<last){
                int temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
                last--;
                first++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
