package assignment;

public class RemoveMNodesAfterNNodes {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        // Insert 20 nodes in the list
        for (int i = 1; i <= 20; i++) {
            list.insertNode(i);
        }

        // Delete 3 nodes after 2 nodes
        list.removeMNodesAfterNNodes(2, 2);

        list.print();

        System.out.println(list);

    }
}
