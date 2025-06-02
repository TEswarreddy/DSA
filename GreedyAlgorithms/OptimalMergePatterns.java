package GreedyAlgorithms;
import java.util.PriorityQueue;
public class OptimalMergePatterns {
    public static int minCost(int[] files){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int file : files) {
            minheap.add(file);
        }
        while(minheap.size() > 1) {
            int first = minheap.poll();
            int second = minheap.poll();
            int cost = first + second;
            System.out.println("Merging files of size " + first + " and " + second + " with cost: " + cost);
            minheap.add(cost);
        }

        return minheap.poll(); // The last remaining element is the total cost

        
    }
    public static void main(String[] args) {
        int files[]={20,30,10,5,30};
        int mincost=minCost(files);
        System.out.println("Minimum cost to merge files: " + mincost);
    }
}
