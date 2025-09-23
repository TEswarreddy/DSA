package Arrays;

public class SumofallSubarrays {
    public static void main(String args[]){
        // int arr[]={1, 4, 5, 3, 2};
        // int n=arr.length;
        // int result=0;
        // for(int i=0;i<n;i++){
        //     int temp=0;
        //     for(int j=i;j<n;j++){
        //         temp+=arr[j];
        //         result+=temp;
        //     }
            
        // }
        // System.out.println(result);
        int arr[]={1, 4, 5, 3, 2};
        int n=arr.length;
        int result=0;
        for(int i=0;i<n;i++){
            result+=(arr[i]*(i+1)*(n-i));
        }
        System.out.println(result);

    }
}
