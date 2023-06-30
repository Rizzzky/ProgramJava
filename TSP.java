import java.util.Arrays;

class TSP {
    private int[][] graph;
    private int numVertices;

    public TSP(int[][] graph) {
        this.graph = graph;
        this.numVertices = graph.length;
    }

    public int tsp() {
        // Set up DP table
        int[][] dp = new int[numVertices][1 << numVertices];

        // Initialize DP table with -1
        for (int i = 0; i < numVertices; i++) {
            Arrays.fill(dp[i], -1);
        }

        // Set initial values for DP
        dp[0][1] = 0;

        // Calculate TSP using DP and Dijkstra's algorithm
        int result = solveTSP(0, 1, dp);
        return result;
    }

    private int solveTSP(int currentNode, int visitedMask, int[][] dp) {
        // If already calculated, return the result
        if (dp[currentNode][visitedMask] != -1) {
            return dp[currentNode][visitedMask];
        }

        // Find the next unvisited node
        int result = Integer.MAX_VALUE;
        for (int nextNode = 0; nextNode < numVertices; nextNode++) {
            if ((visitedMask & (1 << nextNode)) == 0) {
                int newVisitedMask = visitedMask | (1 << nextNode);
                int currentResult = graph[currentNode][nextNode] + solveTSP(nextNode, newVisitedMask, dp);
                result = Math.min(result, currentResult);
            }
        }

        // Store the result in DP table
        dp[currentNode][visitedMask] = result;
        return result;
    }
}

