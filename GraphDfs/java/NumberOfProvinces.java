package GraphDfs.java;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int numProvinces = isConnected.length;
        boolean[] visited = new boolean[numProvinces];
        int numCircles = 0;

        for (int i = 0; i < numProvinces; i++) {
            if (!visited[i]) {
                numCircles++;
                dfs(isConnected, i, visited);
            }
        }

        return numCircles;
    }

    private void dfs(int[][] isConnected, int province, boolean[] visited) {

        visited[province] = true;

        for (int neighbour = 0; neighbour < isConnected[province].length; neighbour++) {
            if (!visited[neighbour] && isConnected[province][neighbour] == 1) {
                dfs(isConnected, neighbour, visited);
            }
        }
    }
}
