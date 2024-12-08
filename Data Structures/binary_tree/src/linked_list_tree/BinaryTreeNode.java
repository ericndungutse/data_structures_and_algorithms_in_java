package linked_list_tree;

public class BinaryTreeNode {
    public String data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public int height;

    public BinaryTreeNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(BinaryTreeNode child) {
        // if left is null, insert to the left
        if (left == null) {
            left = child;
            return;
        } else if (right == null) {
            right = child;
            return;
        }
    }

    @Override
    public String toString() {
        return "data: " + data + ", left: " + left + ", right: " + right + "}";
    }

}
