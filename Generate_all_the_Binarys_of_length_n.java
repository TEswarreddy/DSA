import java.util.*;
class GenerateBinarys
{
    static int arr[];
    static int size;
    static void generate(int n,int k)
    {
        if(n<1)
        {
            for(int i=0;i<size;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
        }
        else
        {
            for(int j=0;j<k;j++)
            {
                arr[n-1]=j;
                generate(n-1,k);
            }
            
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        int k=2; //2 means 0,1 -in ecah binary number we have 0's and 1's
        generate(size,k);
    }
}
