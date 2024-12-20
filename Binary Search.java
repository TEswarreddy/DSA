// Binary Search

class Main 
{
    static void find(int arr[],int mid)
    {
        int start=mid-1;
        int end=mid+1;
        while(true)
        {
            if(arr[mid]==arr[start])
            {
                start--;
            }
            if(arr[mid]==arr[end])
            {
                end++;
            }
            if(arr[mid]!=arr[start]&&arr[mid]!=arr[end])
            {
                break;
            }
        }
        System.out.println("starting position: "+(start+1));
        System.out.println("ending position: "+(end-1));
    }
    static int binarySearch(int arr[],int target)
    {
        int low =0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                
                return mid;
            }
            else if(target<arr[mid])
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={1,2,4,4,4,6,7,12};
        int res=binarySearch(arr,4);
        if(res == -1)
        {
            System.out.println("target is not there");
        }
        else{
            System.out.println("mid value: "+res);
            find(arr,res);
            
        }
    }
}
