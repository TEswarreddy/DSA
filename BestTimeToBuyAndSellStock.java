public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 4, 5, 3, 6,1 };
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0;i<prices.length;i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; // Update the maximum profit
            }
        }

        return maxProfit;
    }
}
