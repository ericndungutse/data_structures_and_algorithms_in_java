package linked_list_with_wrapper;

public class App {
    public static void main(String[] args) throws Exception {
        SingleLinkedList list = new SingleLinkedList();

        Node node1 = new Node(1);
        System.out.println(node1.value);
        list.addNodeAtTheEnd(node1);
        // True
        System.out.println(list.getHead().equals(node1));

        Node node2 = new Node(2);
        list.addNodeAtTheEnd(node2);

        Node node3 = new Node(3);
        list.addNodeAtTheEnd(node3);

        // // Traverse the list
        System.out.println("******* Traversing the list ********");
        System.out.println(list);
        list.traverse();

        // // Add a node at the beginning
        Node node4 = new Node(4);
        list.addNodeAtTheBeginning(node4);
        System.out.println("******* Traversing the list after adding a node at the beginning ********");
        System.out.println(list);
        list.traverse();

        System.out.println("******* ********************************* ********");
        System.out.println("Bofore adding a node");
        System.out.println(list);
        Node node5 = new Node(500);
        list.addNodeAt(2, node5);
        System.out.println("After adding a node");
        System.out.println(list);
    }
}
