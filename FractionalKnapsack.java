public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] w,int[] p,int max)
    {
        int n= w.length;
        double ratio[]=new double[n+1];
        double maxProfit = 0.0;
        // Create an array of indices based on the ratio of profit to weight
        for(int i=0;i<n;i++)
        {
            ratio[i]= (double)p[i]/w[i];
        }
        // Sort the indices based on the ratio in descending order
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ratio[i]<ratio[j])
                {
                    // Swap the ratios and corresponding weights and profits
                    // to maintain the order of items
                    double temp=ratio[i];
                    ratio[i]=ratio[j];
                    ratio[j]=temp;
                    int tempWeight=w[i];
                    w[i]=w[j];
                    w[j]=tempWeight;
                    int tempProfit=p[i];
                    p[i]=p[j];
                    p[j]=tempProfit;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(max >=w[i])
            {
                maxProfit +=p[i];
                max -=w[i];
            }
            else{
                // If the remaining capacity is less than the weight of the item,
                // take the fraction of the item that fits
                maxProfit += p[i] * ((double)max / w[i]);
                break; // Knapsack is full
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] weights = {2,3,5,7,1,4,1};
        int[] profits = {10, 5, 15,7,6,18,3};
        int capacity = 15;
        double maxValue = fractionalKnapsack(weights, profits, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
