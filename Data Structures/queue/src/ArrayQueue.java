import java.util.Arrays;

public class ArrayQueue {
    int arr[];

    int start;
    int end;

    public ArrayQueue(int size) {
        arr = new int[size];
        start = -1;
        end = -1;

        System.out.println("Queue created with size: " + size);
    }

    // We add new elements at the end of the queue / End of the array
    public void enqueue(int value) {
        if (this.isFull()) {
            System.out.println("Queue is full");
            return;
        }
        start = isEmpty() ? 0 : start;
        end += 1;
        arr[end] = value;
    }

    // We remove elements from the start of the queue / Start of the array
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = arr[start];

        start += 1;

        return value;
    }

    public boolean isEmpty() {
        return start == -1 || start > end;
    }

    public boolean isFull() {
        return end == arr.length - 1;
    }

    @Override
    public String toString() {
        return "Queue [arr=" + Arrays.toString(arr) + ", start=" + start + ", end=" + end + "]";
    }

}
