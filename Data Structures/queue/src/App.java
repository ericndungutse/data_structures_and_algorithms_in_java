import linkedListQueueGenerrics.LinkedListQueue;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayQueue q = new ArrayQueue(5);
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // q.enqueue(5);
        // // System.out.println(q.isEmpty());
        // // System.out.println(q.isFull());
        // System.out.println(q);

        // System.out.println(q.dequeue());
        // System.out.println("NEW: " + q);
        // System.out.println(q.dequeue());
        // System.out.println("NEW: " + q);
        // System.out.println(q.dequeue());
        // System.out.println("NEW: " + q);
        // System.out.println(q.dequeue());
        // System.out.println("NEW: " + q);
        // System.out.println(q.dequeue());
        // System.out.println("NEW: " + q);
        // System.out.println(q.dequeue());

        // Generics
        System.out.println("------------ Integer Linked List -----------");
        LinkedListQueue<Integer> integerQ = new LinkedListQueue<>();

        integerQ.enqueue(1);
        integerQ.enqueue(2);
        integerQ.enqueue(3);
        System.out.println(integerQ);

        System.out.println("------------ String Linked List -----------");
        LinkedListQueue<String> stringQ = new LinkedListQueue<>();
        stringQ.enqueue("A");
        stringQ.enqueue("B");
        stringQ.enqueue("C");

        System.out.println(stringQ);

        stringQ.dequeue();
        stringQ.dequeue();
        stringQ.dequeue();
        stringQ.dequeue();

    }
}
