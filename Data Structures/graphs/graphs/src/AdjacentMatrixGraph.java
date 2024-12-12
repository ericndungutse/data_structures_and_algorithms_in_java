import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacentMatrixGraph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] matrix;

    public AdjacentMatrixGraph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        // Re: The initial values of the matrix are all 0.
        matrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }

    public void display() {
        System.out.print("  ");
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(" " + nodeList.get(i).name);
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodeList.get(i).name + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Breafth First Search
    public void bfs() {
        // Create a queue
        Queue<GraphNode> queue = new LinkedList<>();
        // add first node to the queue
        queue.add(nodeList.get(0));

        // while queue is not empty
        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            if (current.is_visited)
                continue;

            // Display the current node: VISIT
            System.out.println(current.name);

            // Get the array representation of adjacent nodes of current nodes. i.e. for A,
            // get [0,1,1,1,0]
            int[] arr = matrix[current.index];

            // Declare array of current node adjacent GraphNodes
            ArrayList<GraphNode> neighbors = new ArrayList<>();

            // Populate the neighbors array with the GraphNode objects of the adjacent nodes
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    neighbors.add(nodeList.get(i));
                }
            }

            // Display the current node's neigbours and Add the current node's neighbors to
            // the queue
            for (int i = 0; i < neighbors.size(); i++) {
                // System.out.println(neighbors.get(i).name);
                queue.add(neighbors.get(i));
            }

            // Mark the current node as visited
            current.is_visited = true;
        }

    }
}
