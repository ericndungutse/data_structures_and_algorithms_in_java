package arrayCircularQueue;

import java.util.Arrays;

public class Queue {
    int[] arr;

    int front;
    int rear;
    int size;

    public Queue(int size) {
        arr = new int[size];
        front = -1;
        // After inserting the first element, rear will be 0
        rear = -1;
        this.size = arr.length;

        System.out.println("Queue created with size: " + size);
    }

    // Enqueue
    public void enqueue(int data) {
        // Check if the queue is full
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % size;

        // Insert the first element
        if (isEmpty()) {
            front = 0;
        }

        arr[rear] = data;

    }

    // Dequeue
    public int dequeue() {
        // Check if the queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = arr[front];

        // If there is only one element in the queue
        if (rear == front) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return data;
    }

    // delete queue
    public void deleteQueue() {
        arr = null;
    }

    // Is Empty
    public boolean isEmpty() {
        return front == -1;
    }

    // is Full
    public boolean isFull() {
        // It is full if next position is equal to front
        return (rear + 1) % size == front;
    }

    @Override
    public String toString() {
        return "Queue [arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + ", size=" + size + "]";
    }

}
