package linkedListQueue;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void equeue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = front.data;
        front = front.next;

        // IF Only one element in queue and is removed, then rear should be null
        if (front == null) {
            rear = null;
        }

        return data;
    }

    public int peek() {
        return front.data;
    }

    @Override
    public String toString() {
        return "Queue [front=" + front + ", rear=" + rear + "]";
    }

}
