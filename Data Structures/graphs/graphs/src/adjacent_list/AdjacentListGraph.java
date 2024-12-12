package adjacent_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacentListGraph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public AdjacentListGraph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    // i Index of 1st Node and j index of 2nd Node in nodeList
    public void addUndirectedEdge(int i, int j) {
        // 0
        GraphNode first = nodeList.get(i);
        // 1
        GraphNode second = nodeList.get(j);

        first.neighbors.add(second);
        second.neighbors.add(first);

    }

    public void display() {
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).name + ": ");
            for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
                System.out.print(" -> " + nodeList.get(i).neighbors.get(j).name);
            }
            System.out.println();
        }

    }

    // BFS traversal
    public void bfs() {
        // Create a queue
        Queue<GraphNode> queue = new LinkedList<>();

        // add first element in the queue
        queue.add(nodeList.get(0));

        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            if (current.is_visited)
                continue;

            // Visit the node
            System.out.print(current.name + ", ");

            // Add its adjacent nodes to the queue
            for (GraphNode neighbor : current.neighbors) {
                queue.add(neighbor);
            }
            // Mark the node as visited
            current.is_visited = true;
        }

    }
}
