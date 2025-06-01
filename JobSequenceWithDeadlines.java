public class JobSequenceWithDeadlines {
    public static void jobsequence(int profits[],int[] deadlines,char[] jobs){
        boolean[] slot = new boolean[deadlines.length];
        int[] result = new int[deadlines.length];
        int profit =0;
        for(int i=0;i<deadlines.length;i++){
            result[i] = -1; // Initialize result array with -1
        }
        for(int i=0;i<profits.length;i++){
            for(int j=i+1;j<deadlines.length;j++){
                if(profits[j] >profits[i]){
                    // Swap profits and deadlines to maintain the order
                    int tempProfit = profits[i];
                    profits[i] = profits[j];
                    profits[j] = tempProfit;
                    int tempDeadline = deadlines[i];
                    deadlines[i] = deadlines[j];
                    deadlines[j] = tempDeadline;
                    char tempJob = jobs[i];
                    jobs[i] = jobs[j];
                    jobs[j] = tempJob; 
                }
            }
        }

        //for checkeing soerting of profits and deadlines    
        // for(int i=0;i<profits.length;i++){
        //     System.out.println("Profit: " + profits[i] + ", Deadline: " + deadlines[i]);
        // }

        for(int i=0;i<profits.length;i++){

            for(int j=deadlines[i]-1;j>=0;j--){
                if(!slot[j]){
                    slot[j]=true; // Mark the slot as occupied
                    result[j]=i;
                    profit += profits[i]; // Add profit to total profit
                    break; // Break the loop once a slot is found

                }
            }
        }
        System.out.println("Maximum Profit: " + profit);
        System.out.print("Jobs taken: ");
        for(int i=0;i<result.length;i++){
            if(result[i] != -1){
                System.out.print( (jobs[i]) + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        char[] jobs= {'a', 'b', 'c', 'd', 'e'};
        int profits[] = {5,15,10,20,1};
        int deadlines[] = {3, 2, 1, 2, 3};
        jobsequence(profits, deadlines,jobs);
    }
}
