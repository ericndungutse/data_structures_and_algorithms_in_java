package linked_list_tree.V2_with_wrapper;

public class BinaryNode {
    public String data;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = this.height + 1;
    }

    @Override
    public String toString() {
        return "BinaryNode [data=" + data + ", left=" + left + ", right=" + right + ", height=" + height + "]";
    }

}
