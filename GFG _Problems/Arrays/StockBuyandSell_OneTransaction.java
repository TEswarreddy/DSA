package Arrays;

public class StockBuyandSell_OneTransaction {
    public static void main(String args[]){
       int arr[]={7,10,1,3,6,9,2};
       int min=arr[0];
       int res=0;
       for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            res=Math.max(res,arr[i]-min);
       }
       System.out.println(res);
    }
}
