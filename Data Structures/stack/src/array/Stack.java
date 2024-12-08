package array;

import java.util.Arrays;

public class Stack {
    int[] arr;
    // topOfStack is the index of the element at the top of the stack
    int topOfStack;

    public Stack(int size) {

        this.arr = new int[size]; // O(n) space complexity, O(1) time complexity
        // -1 indicates that the stack is empty
        this.topOfStack = -1; // O(1) time complexity

        System.out.println("The Stack has been created with size: " + size); // O(1) time complexity
    }

    // isEmpty
    public boolean isEmpty() {
        if (this.topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
            return;
        }

        topOfStack++;
        arr[topOfStack] = value;

        System.out.println("Element has been pushed to the stack: " + value);
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }

        int topElement = arr[topOfStack];
        topOfStack--;

        System.out.println("Element has been popped from the stack: " + topElement);
        return topElement;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }

        return arr[topOfStack];
    }

    // delete
    public void delete() {
        arr = null;
        topOfStack = -1;
        System.out.println("The stack has been deleted");
    }

    @Override
    public String toString() {
        return "Stack [arr=" + Arrays.toString(arr) + ", topOfStack=" + topOfStack + "]";
    }

}
