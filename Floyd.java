import java.util.Arrays;
public class Floyd {

    private static final int INF = 9999999;
    public static void main(String[] args) {
        int [][] graph = {
            {0,6,INF,7},
            {6,0,INF,1},
            {INF,INF,0,3},
            {7,1,3,0},
        };
        int[][] result = floydWarshall(graph);
        for (int i = 0;i< result.length; i ++){
            System.out.println(Arrays.toString(result[i]));
        }  
    }
    private static int[][] floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];

        for (int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                dist[i][j] = graph[i][j];
            }
        }
        for (int k=0;k<V;k++){
            for (int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if (dist[i][k] + dist[k][j] < dist [i][j]){
                        dist [i][j] = dist[i][k] + dist [k][j];
                    }
                }
            }
        }
        return dist;
    }
}
