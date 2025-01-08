import java.util.*;
class GenerateBinary
{
    static int arr[];
    static int size;
    static void generate(int n)
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
            arr[n-1]=0;
            generate(n-1);

            arr[n-1]=1;
            generate(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        generate(size);
    }
}

/*
Output:
3
0 0 0  
1 0 0
0 1 0
1 1 0
0 0 1
1 0 1
0 1 1
1 1 1

Output:
2
0 0  
1 0
0 1
1 1
*/
