package linked_list_tree.V2_with_wrapper;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree binaryTree = new BinaryTree();

        BinaryNode N1 = new BinaryNode("N1");
        BinaryNode N2 = new BinaryNode("N2");
        BinaryNode N3 = new BinaryNode("N3");
        BinaryNode N4 = new BinaryNode("N4");
        BinaryNode N5 = new BinaryNode("N5");
        BinaryNode N6 = new BinaryNode("N6");
        BinaryNode N7 = new BinaryNode("N7");
        BinaryNode N8 = new BinaryNode("N8");
        // BinaryNode N9 = new BinaryNode("N9");

        N1.left = N2;
        N1.right = N3;

        N2.left = N4;
        N2.right = N5;

        N3.left = N6;
        N3.right = N7;

        N4.left = N8;
        // N4.right = N9;

        binaryTree.root = N1;

        // System.out.println("---------------- Pre Order Traversal ----------------");
        // binaryTree.preOrder(binaryTree.root);
        // System.out.println("\n");
        // System.out.println("---------------- In Order Traversal ----------------");
        // binaryTree.inOrder(binaryTree.root);

        // System.out.println("\n");
        // System.out.println("---------------- Level Order Traversal
        // ----------------");
        // binaryTree.levelOrder();

        // // System.out.println("\n");
        // // System.out.println("---------------- Search ----------------");
        // // System.out.println(binaryTree.search("N10"));

        // System.out.println("\n");
        // System.out.println("---------------- Insert New Node ----------------");

        // System.out.println(binaryTree.insert("N10"));
        // System.out.println(N5);

        // System.out.println("\n");
        // System.out.println("---------------- Delete Node ----------------");
        // System.out.println("Deepest Node " + binaryTree.findDeepestNode());

        // binaryTree.levelOrder();
        // System.out.println("Deepest Node" + binaryTree.findDeepestNode().data);

        // binaryTree.levelOrder();
        // binaryTree.deleteDeepestNode();
        // System.out.println("After deleting the deepest node");
        // binaryTree.levelOrder();

        System.out.println("Before Delete");
        binaryTree.levelOrder();

        binaryTree.deleteNode("N3");
        System.out.println("After Delete");
        // binaryTree.levelOrder();

        System.out.println(
                "N1 data: " + N1.data + "\nN1 Right Data new: " + N1.right.data + "\nN4 Left Data new: " + N4.left);

        System.out.println(N8);

    }
}
