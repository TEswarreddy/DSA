package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] arr)
    {
        
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }

    public static void main(String[] args) {
        {
            int arr[]={0,0,1,1,1,2,2,3,3,4,4};
            int sol=removeDuplicates(arr);
            System.out.println(sol);
            for(int i=0;i<sol;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
