package Arrays;

class StockBuyandSellMultipleTransactions {
    public static void main(String args[]){
        int prices[]={100, 180, 260, 310, 40, 535, 695};
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
                if(prices[i+1]>prices[i]){
                    profit+=prices[i+1]-prices[i];
                }
        }
        System.out.println(profit);
    }
}
