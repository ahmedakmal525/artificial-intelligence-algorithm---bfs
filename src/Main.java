/**
 * Breadth First Search Algorithm
 *
 * */
public class Main {

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 1},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 1, 0}
        };

        Graph graph = new Graph(adjacencyMatrix, 0);
        graph.breadthFirstSearch();
    }
}
