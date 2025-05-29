public class SearchInRowWiseAndColumnWiseSortedArray {
    public static void main(String[] args)
    {
        int[][] arr={{3,30,38},{36,43,60},{40,51,69}};
        int rows=arr.length;
        int cols=arr[0].length;
        // System.out.println(rows);
        // System.out.println(cols);
        int row=0; //starting from first row and last column
        int col=cols-1;
        int key=62;
        boolean res=false;
        while(row<rows && col>=0)
        {
            if(arr[row][col]==key)
            {
                res=true;
                break;
            }
            else if(arr[row][col]<key)
            {
                row=row+1;
            }
            else
            {
                col=col-1;
            }
        }
        if(res==false)
        {
            System.out.println("NOt founded");
        }
        else
        {
            System.out.println("founded");
        }
    }
}
