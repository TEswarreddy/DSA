package Arrays;


import java.util.Arrays;
public class ReverseanArray {
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 5};
        int last=arr.length-1;
        int first=0;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            last--;
            first++;
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
}
