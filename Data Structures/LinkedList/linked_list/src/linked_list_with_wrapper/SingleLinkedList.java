package linked_list_with_wrapper;

public class SingleLinkedList {
    private Node head = null;
    // Helps to determine where to add new element
    private Node tail = null;
    private int size = 0;

    public SingleLinkedList() {
    }

    // At the end of the list
    public void addNodeAtTheEnd(Node node) {
        if (head == null) {
            head = node;
            tail = node;
            size += 1;
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    // At the beginning of the list
    public void addNodeAtTheBeginning(Node node) {
        if (head == null) {
            head = node;
            tail = node;
            size += 1;
            return;
        }
        node.next = head;
        head = node;
        size += 1;
    }

    // ******** V1 **********
    // In the middle of the list
    public void addNodeAt(int location, Node node) {
        if (location < 1 || location > size + 1) {
            throw new IndexOutOfBoundsException("Invalid location");
        }
        if (location == 1) {
            addNodeAtTheBeginning(node);
            return;
        }
        if (location == size + 1) {
            addNodeAtTheEnd(node);
            return;
        }

        Node currNode = head;

        // Set the node at location to point to the new node
        for (int i = 2; i <= size; i++) {
            if (i == location) {
                Node temp = currNode.next;
                currNode.next = node;
                node.next = temp;
                size += 1;
                return;
            }
            currNode = currNode.next;
        }

    }

    // ******** V2 **********
    // In the middle of the list
    // public void addNodeAt(int location, Node node) {
    // if (location < 1 || location > size + 1) {
    // throw new IndexOutOfBoundsException("Invalid location");
    // }
    // if (location == 1) {
    // addNodeAtTheBeginning(node);
    // return;
    // }
    // if (location == size + 1) {
    // addNodeAtTheEnd(node);
    // return;
    // }

    // Node currNode = head;

    // // Set the node at location to point to the new node
    // for (int i = 2; i < location; i++) {
    // currNode = currNode.next;
    // }

    // Node temp = currNode.next;
    // currNode.next = node;
    // node.next = temp;
    // size += 1;

    // }

    // Traverse the list
    public void traverse() {
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.value);
            currNode = currNode.next;
        }
    }

    @Override
    public String toString() {
        return "SingleLinkedList [head=" + head + "]";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getHead() {
        return head;
    }

}
