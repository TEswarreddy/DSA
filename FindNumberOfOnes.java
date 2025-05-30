public class FindNumberOfOnes {
    public static int lowerbound(int[] arr,int key,int n)
    {
        int l=0;
        int h=n-1;
        int lb=n;
        
        while(l<=h)
        {
            int m=(l+h)/2;
            if(arr[m]>=key)
            {
                lb=m;
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return lb;
    }
    public static int upperbound(int[] arr,int key,int n)
    {
        
        int l=0;
        int h=n-1;
        int ub=n;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==key)
            {

                ub=mid;
                l=mid+1;
            }
            else if(arr[mid]>key)
            {
                ub=mid;
                h=mid-1;

            }
            else
            {
                l=mid+1;
            }
        }
        return ub;
    }
    public static void main(String[] args)
    {
        int[] arr={0,0,0,0,1,1,1,1,1,2,2,2,2,3,3,3,3};
        int key=1;
        int n=arr.length;
        int lb=lowerbound(arr,key,n);
        int ub=upperbound(arr,key,n);
        System.out.println(ub-lb);


    }
}
