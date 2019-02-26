import java.util.LinkedList;
import java.util.Queue;

class Graph {

    private int[][] adjacencyMatrix;
    private int rootNode;
    private int newNodes;

    private boolean[] visited;

    Graph(int[][] adjacencyMatrix, int rootNode) {
        this.rootNode = rootNode;
        newNodes = adjacencyMatrix.length;
        
        this.adjacencyMatrix = new int[newNodes][newNodes];
        this.visited = new boolean[newNodes];

        for (int k = 0; k < newNodes; k++) {
            for (int l = 0; l < newNodes; l++) {
                this.adjacencyMatrix[k][l] = adjacencyMatrix[k][l];
            }
        }
    }

    void breadthFirstSearch() {
        Queue<Integer> integerQueue = new LinkedList<>();
        clearVisited();
        integerQueue.add(rootNode);

        while (!integerQueue.isEmpty()) {
            int nextNode;
            nextNode = integerQueue.remove();
            if (!visited[nextNode]) {
                visited[nextNode] = true;
                for (int i = 0; i < newNodes; i++) {
                    if (adjacencyMatrix[nextNode][i] > 0 && !visited[i]) {
                        integerQueue.add(i);
                    }
                }
                printNode(nextNode);
            }
        }
    }

    private int getUnvisitedChildNode(int n) {
        for (int j = 0; j < newNodes; j++) {
            if (adjacencyMatrix[n][j] > 0) {
                if (!visited[j])
                    return(j);
            }
        }
        return -1;
    }

    private void clearVisited() {
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
    }

    private void printNode(int n) {
        System.out.println("Nearest to node " + rootNode + " is node: " + n);
    }
}
