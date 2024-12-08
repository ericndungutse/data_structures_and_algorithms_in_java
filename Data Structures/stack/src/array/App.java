package array;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(4);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        int removeEl = stack.pop();
        stack.delete();
        System.out.println(stack);

        // System.out.println(stack.isEmpty());
        // System.out.println(stack.isFull());

    }
}
