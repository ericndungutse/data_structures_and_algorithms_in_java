package SimpleTree;

public class Tree {
    public static void main(String[] args) throws Exception {
        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");

        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");

        hot.addChild(tea);
        hot.addChild(coffee);

        tea.addChild(new TreeNode("Black Tea"));
        tea.addChild(new TreeNode("Green Tea"));
        coffee.addChild(new TreeNode("Black Coffee"));
        coffee.addChild(new TreeNode("Cold Coffee"));

        cold.addChild(new TreeNode("Coke"));
        cold.addChild(new TreeNode("Pepsi"));

        drinks.addChild(hot);
        drinks.addChild(cold);

        System.out.println("*********************************");

        System.out.println(drinks.printLevel(3));
        // System.out.println(drinks.print());

        // System.out.println(drinks);

        // System.out.println(drinks);
    }
}
