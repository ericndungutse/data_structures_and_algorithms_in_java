package array_list_representation;

import java.util.ArrayList;

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
}
