package Arrays;

public class MoveZeroes {
    public static void moveZeroes(int arr[])
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]==0 && arr[j]!=0)
            {
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
            else if(arr[i]!=0)
            {
                i++;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,0,1};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
