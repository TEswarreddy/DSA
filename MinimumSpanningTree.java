import java.util.PriorityQueue;

class MinimumSpanningTree {
    public static int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean[] visited=new boolean[n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,0});
        int totalcost=0;
        int count=0;
        while(count<n)
        {
            int curr[]=pq.poll();
            int cost=curr[0];
            int node1=curr[1];
            if(visited[node1])
                continue;
            visited[node1]=true;
            totalcost +=cost;
            count++;

            for(int node2=0 ;node2 < n; node2++)
            {
                if(!visited[node2])
                {
                    int manhattenDistance=Math.abs(points[node1][0]-points[node2][0])+Math.abs(points[node1][1]-points[node2][1]);
                    pq.offer(new int[]{manhattenDistance,node2});
                }
            }

        }
        return totalcost;

    }
    public static void main(String[] args) {
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        System.out.println(minCostConnectPoints(points)); // Output: 20
    }
}