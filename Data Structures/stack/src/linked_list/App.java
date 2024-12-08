package linked_list;

public class App {

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();

        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        System.out.println(stack);

        int removed = stack.pop();
        System.out.println("Node removed: " + removed);
        System.out.println(stack);

        System.out.println(stack.peek());
        stack.deleteStack();
        System.out.println(stack);
    }
}
