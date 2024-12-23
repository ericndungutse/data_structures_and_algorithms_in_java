import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        // nodeList.add(new GraphNode("A", 0));
        // nodeList.add(new GraphNode("B", 1));
        // nodeList.add(new GraphNode("C", 2));
        // nodeList.add(new GraphNode("D", 3));
        // nodeList.add(new GraphNode("E", 4));

        // AdjacentMatrixGraph graph = new AdjacentMatrixGraph(nodeList);
        // graph.addUndirectedEdge(0, 1);
        // graph.addUndirectedEdge(0, 2);
        // graph.addUndirectedEdge(0, 3);
        // graph.addUndirectedEdge(1, 0);
        // graph.addUndirectedEdge(1, 4);
        // graph.addUndirectedEdge(2, 3);
        // graph.addUndirectedEdge(3, 2);
        // graph.addUndirectedEdge(3, 4);

        // // graph.display();
        // graph.bfs();

        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));

        AdjacentMatrixGraph graph = new AdjacentMatrixGraph(nodeList);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(1, 3);
        graph.addUndirectedEdge(1, 6);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(2, 4);
        graph.addUndirectedEdge(3, 5);
        graph.addUndirectedEdge(4, 5);
        graph.addUndirectedEdge(5, 6);

        graph.bfs(); // Output: A B C D G E F

    }
}
