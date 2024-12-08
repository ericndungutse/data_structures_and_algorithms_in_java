package SimpleTree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String data;
    List<TreeNode> children;

    public TreeNode(String data) {
        this.data = data;
        children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }

    public String printLevel(int level) {

        // System.out.println(leveler);
        String ret = "  ".repeat(Math.abs(level - 3)) + data + "\n";

        // When do we stop?
        if (level == 0) {
            return ret;
        }

        for (TreeNode child : children) {
            ret += child.printLevel(level - 1);
        }

        return ret;
    }

    // TRAVERSE THE WHOLE TREE
    public String print() {
        String ret = data + "\n";

        for (TreeNode child : children) {
            ret += child.print();
        }

        return ret;
    }

    @Override
    public String toString() {
        return "TreeNode [data=" + data + ", children=" + children + "]";
    }

}
