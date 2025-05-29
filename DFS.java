public class DFS {
    static void  dfs(int[][] graph, boolean[] visited, int vertex) {
        // Mark the current vertex as visited
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int i = 0; i < graph[vertex].length; i++) {
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }
    public static void main(String args[]){
        // Create a graph represented as an adjacency matrix
        int[][] graph = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1},
            {0, 0, 1, 1, 0}
        };
        System.out.println("length of graph: " + graph.length);
        for (int i = 0; i < graph[0].length; i++) {
            
                System.out.print(graph[0][i] + " ");
            
        }
        // Perform DFS starting from vertex 0
        boolean[] visited = new boolean[graph.length];
        System.out.println("DFS traversal starting from vertex 0:");
        dfs(graph, visited, 0);
    }
}
