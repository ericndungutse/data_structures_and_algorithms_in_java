package linked_list_tree.V2_with_wrapper;

import java.util.Queue;

public class BinaryTree {
    public BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Preorder traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrder(node.left);

        preOrder(node.right);
    }

    // In order traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Post order traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // Level order traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presBinaryNode = queue.remove();
            System.out.println(presBinaryNode.data + " ");
            if (presBinaryNode.left != null) {
                queue.add(presBinaryNode.left);
            }

            if (presBinaryNode.right != null) {
                queue.add(presBinaryNode.right);
            }
        }
    }

    // Search for a node
    public BinaryNode search(String data) {
        Queue<BinaryNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presBinaryNode = queue.remove();
            if (presBinaryNode.data.equals(data)) {
                return presBinaryNode;
            }

            if (presBinaryNode.left != null) {
                queue.add(presBinaryNode.left);
            }

            if (presBinaryNode.right != null) {
                queue.add(presBinaryNode.right);
            }
        }

        return null;
    }

    // Inser a node
    public BinaryNode insert(String data) {
        BinaryNode newNode = new BinaryNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }

        Queue<BinaryNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode frontNode = queue.remove();

            if (frontNode.left == null) {
                frontNode.left = newNode;
                return newNode;
            }

            if (frontNode.right == null) {
                frontNode.right = newNode;
                return newNode;
            }

            queue.add(frontNode.left);
            queue.add(frontNode.right);
        }

        return newNode;

    }

    // ------------- DELETE A NODE ----------------
    // a) Find Deepest Node
    public BinaryNode findDeepestNode() {
        if (root == null) {
            return null;
        }

        Queue<BinaryNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        BinaryNode presentNode = null;

        while (!queue.isEmpty()) {
            presentNode = queue.remove();

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }

        return presentNode;
    }

    // b) Delete Deepest Node
    public void deleteDeepestNode() {
        if (root == null) {
            return;
        }

        Queue<BinaryNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        BinaryNode presentNode = null;

        while (!queue.isEmpty()) {
            // previousNode = presentNode;
            presentNode = queue.remove();

            if (presentNode.right != null && presentNode.right.equals(findDeepestNode())) {
                presentNode.right = null;
                return;
            } else if (presentNode.left != null && presentNode.left.equals(findDeepestNode())) {
                presentNode.left = null;
                return;
            }

            queue.add(presentNode.left);
            queue.add(presentNode.right);

        }
    }

    // c) Delete a node
    // TODO: Exchange Values
    public void deleteNode(String data) {

        if (root == null) {
            return;
        }

        // Search for node to delete
        BinaryNode nodeToDelete = search(data);
        BinaryNode deepNode = findDeepestNode();

        // Node to delete children
        BinaryNode nodeToDeleteLeftChild = nodeToDelete.left;
        BinaryNode nodeToDeleteRightChild = nodeToDelete.right;

        // deleteDeepestNode
        deleteDeepestNode();

        // *** 1) Find Position of node to delete and its parent

        Queue<BinaryNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        BinaryNode parentNode = null;
        String nodeToDeletePosition = "";

        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();

            // Check if it is the present node is the parent of node to be deleted
            if (presentNode.right != null && presentNode.right.equals(nodeToDelete)) {
                parentNode = presentNode;
                nodeToDeletePosition = "right";
            } else if (presentNode.left != null && presentNode.left.equals(nodeToDelete)) {
                parentNode = presentNode;
                nodeToDeletePosition = "left";
            }

            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }

        // *** 2) Add the children of the node to delete to the deepest node
        if (nodeToDeleteRightChild != null) {
            deepNode.right = nodeToDelete.right;
        }

        if (nodeToDeleteLeftChild != null) {
            deepNode.left = nodeToDelete.left;
        }

        // *** 3) Add deepest node to the parent of the node to delete
        if (nodeToDeletePosition.equals("right")) {
            parentNode.right = deepNode;
        } else {
            parentNode.left = deepNode;
        }

        // System.out.println("Deepest Node: " + findDeepestNode().data);
        // System.out.println("Parent Node: " + parentNode.data);
        // System.out.println("Node to delete: " + nodeToDelete.data);
        // System.out.println("Delete Node Position: " + nodeToDeletePosition);

    }

    @Override
    public String toString() {
        return "BinaryTree [root=" + root + "]";
    }

}
