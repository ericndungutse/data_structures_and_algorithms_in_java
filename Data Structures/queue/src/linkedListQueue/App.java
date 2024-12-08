package linkedListQueue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue list = new Queue();

        list.equeue(1);
        list.equeue(2);
        list.equeue(3);
        list.equeue(4);

        System.out.println(list);
        System.out.println("--------------------------------------------");
        System.out.println("Dequeue: " + list.dequeue());
        System.out.println("Dequeue: " + list.dequeue());
        System.out.println("Dequeue: " + list.dequeue());
        System.out.println("Dequeue: " + list.dequeue());
        System.out.println(list);

    }
}
