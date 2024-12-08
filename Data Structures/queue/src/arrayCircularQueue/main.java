package arrayCircularQueue;

public class main {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(5);

        System.out.println(q.isEmpty());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.enqueue(109320);
        System.out.println(q);
    }

}
