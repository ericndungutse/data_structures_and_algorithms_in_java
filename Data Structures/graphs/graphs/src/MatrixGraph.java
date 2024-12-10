import java.util.ArrayList;

public class MatrixGraph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] matrix;

    public MatrixGraph(ArrayList<GraphNode> nodeList) {
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
}
