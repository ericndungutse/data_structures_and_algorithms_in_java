package linked_list_tree;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTreeNode drinks = new BinaryTreeNode("Drinks");

        BinaryTreeNode hot = new BinaryTreeNode("Hot");
        BinaryTreeNode cold = new BinaryTreeNode("Cold");

        drinks.insert(hot);
        drinks.insert(cold);

        hot.insert(new BinaryTreeNode("Tea"));

        System.out.println(drinks);
    }
}
