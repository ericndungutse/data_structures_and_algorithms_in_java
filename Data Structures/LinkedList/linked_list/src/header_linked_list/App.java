package header_linked_list;

public class App {
    public static void main(String[] args) throws Exception {
        Node header = new Node(0);
        insertNode(header, 1);
        insertNode(header, 2);

        printNodeList(header);
    }

    public static void printNodeList(Node header) {
        Node currNode = header;
        while (currNode.next != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    // Header is the first node in the linked list
    // Where to add new node;
    public static void insertNode(Node header, int data) {
        // Search the last node - where next is null
        Node currNode = header;
        while (currNode.next != null) {
            currNode = header.next;
        }

        Node newNode = new Node(data);
        currNode.next = newNode;
    }
}
