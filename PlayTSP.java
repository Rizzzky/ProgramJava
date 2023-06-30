public class PlayTSP {
    public static void main(String[] args) {
        int[][] graph = {
            { 0, 2, 9, 10 },
            { 1, 0, 6, 4 },
            { 15, 7, 0, 8 },
            { 6, 3, 12, 0 }
        };

        TSP tspSolver = new TSP(graph);
        int minDistance = tspSolver.tsp();
        System.out.println("Minimum distance for TSP: " + minDistance);
    }
}
