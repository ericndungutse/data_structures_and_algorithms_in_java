package circular_singly_linked_list;

class Node {
    String branchName;
    Node next;

    Node(String branchName) {
        this.branchName = branchName;
        this.next = null;
    }

    @Override
    public String toString() {
        return "{ branchName: " + branchName + ", next:" + next.branchName + "}";
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Node header = new Node("Nyarugenge");
        header.next = header;

        insertNode(header, "Gasabo");
        insertNode(header, "Kicukiro");

        printNodeList(header);

    }

    public static void insertNode(Node header, String branchName) {
        // Create new node
        Node newNode = new Node(branchName);

        // Get the last node: next of header
        Node lastNode = header;
        while (lastNode.next != header) {
            lastNode = lastNode.next;
        }

        // Set next of last ndoe to new node
        lastNode.next = newNode;

        // // Join last node and the header node: set next of newNode to header
        newNode.next = header;

    }

    public static void printNodeList(Node header) {
        Node currNode = header;

        do {
            System.out.println(currNode.branchName);
            currNode = currNode.next;
        } while (currNode.branchName != header.branchName);

    }
}
