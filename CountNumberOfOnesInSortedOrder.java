public class CountNumberOfOnesInSortedOrder {
    public static void main(String[] args)
    {
        int[] arr={0,0,1,1,1,1};
        int l=0;
        int h=arr.length -1;
        int res=-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(arr[m]==1)
            {
                res=m;
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        if(res==-1)
        {
            System.out.println("0");

        }
        else
        {
            System.out.println(arr.length-res);
        }
    }
    
}
