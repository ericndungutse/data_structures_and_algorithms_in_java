import java.util.LinkedList;
import java.util.Queue;

public class Builtin_queue {
    public static void main(String[] args) throws Exception {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        // Display the first element
        System.out.println(q.element());
        System.out.println(q.peek());
        System.out.println(q);

        // Remove the first element, throws exception if empty
        System.out.println(q.remove());
        // Remove the first element, returns null if empty
        System.out.println(q.poll());
        q.clear();

        System.out.println(q.poll());
        // System.out.println(q);
        // System.out.println(q.poll());
        // System.out.println(q);
        // q.remove();

        // System.out.println(q);
    }
}
