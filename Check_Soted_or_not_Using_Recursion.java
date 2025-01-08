class Check_Soted_or_not_Using_Recursion
{
    public static int check(int[] arr,int index)
    {
        if(index==1)
        {
            return 1;
        }
        return(arr[index-1]<arr[index-2] ? 0:check(arr,index-1));
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5,6,7};
        int size=array.length;
        if(check(array,size)==1)
        {
            System.out.println("It is in sorted order");
        }
        else
        {
            System.out.println("It is not in sorted array");
        }
    }
}

/*
Output:
It is in sorted order
*/
