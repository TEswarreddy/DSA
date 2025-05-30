public class UpperBound {
    public static void main(String args[])
    {
        int[] arr={3,5,8,9,9,9,15,19};
        int n=arr.length;
        int l=0;
        int h=n-1;
        int key=9;
        int sol=n;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==key)
            {

                sol=mid;
                l=mid+1;
            }
            else if(arr[mid]>key)
            {
                sol=mid;
                h=mid-1;

            }
            else
            {
                l=mid+1;
            }
        }
        System.out.println(sol);
    }
}
