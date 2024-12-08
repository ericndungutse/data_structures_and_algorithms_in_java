package linkedListQueueGenerrics;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }

}

public class LinkedListQueue<T> {
    Node<T> front;
    Node<T> rear;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return front.data;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (front == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;

    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    @Override
    public String toString() {
        return "LinkedListQueue [front=" + front + ", rear=" + rear + "]";
    }

}
