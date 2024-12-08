package linked_list;

public class Stack {
    private LinkedList linkedList;

    Stack() {
        linkedList = new LinkedList();
    }

    public boolean isEmpty() {
        return linkedList.getHead() == null;
    }

    public void push(Node node) {
        linkedList.addNodeAtTheBeginning(node);
        System.out.println("Node pushed: " + node.value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int removedNode = linkedList.head.value;
        linkedList.head = linkedList.head.next;

        return removedNode;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return linkedList.head.value;
    }

    public void deleteStack() {
        linkedList.head = null;
    }

    @Override
    public String toString() {
        return "Stack [linkedList=" + linkedList + "]";
    }

}
