// using binary search technique because it reduces time complexity and given data in sorted, Time Complexity O(log n)
public class Lowerbound
{
    public static void main(String args[])
    {
        int[] arr={3,5,8,15,19};
        int l=0;
        int h=arr.length-1;
        int lb=-1;
        int key=20;
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
        if(lb==-1)
        {
            System.out.println(arr.length);
        }
        else
        {
            System.out.println( lb);
        }
    }
}