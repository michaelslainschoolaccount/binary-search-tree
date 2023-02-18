public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = new Node();
    }

    public BinaryTree(Node node) {
        root = node;
    }

    public Node search(int key) {
        return searchHelper(root, key);
    }

    public Node searchHelper(Node node, int key) {
        if (!(node != null && node.getKey() != key))
            return node;

        if (key < node.getKey())
            return searchHelper(node.getLeftChild(), key);

        return searchHelper(node.getRightChild(), key);
    }

    public void insert(Node node) {
        Node parent = findInsertionNode(node.getKey());

        if (parent == null) {
            root = node;
            return;
        }

        if (parent.getKey() > node.getKey()) {
            parent.setLeftChild(node);
            return;
        }

        parent.setRightChild(node);
    }

    public Node findInsertionNode(int key) {
        Node out = null;
        Node node = root;

        while (node != null) {
            out = node;

            if (key < node.getKey()) {
                node = node.getLeftChild();
                continue;
            }

            node = node.getRightChild();
        }

        return out;
    }

    public void delete(Node node) {
        if (childless(node)) {
            scrubParent(node);
            return;
        }

        if (oneChild(node)) {
            spliceOut(node);
            return;
        }

        rotateOut(node);
    }

    public boolean childless(Node node) {
        if (node == null)
            return true;

        return node.childCount() == 0;
    }

    public boolean oneChild(Node node) {
        if (node == null)
            return false;

        return node.childCount() == 1;
    }

    public void scrubParent(Node node) {
        if (node == null)
            return;

        Node parent = node.getParent();

        if (parent == null) {
            root = null;
            return;
        }

        if (node == parent.getRightChild()) {
            parent.setRightChild(null);
            return;
        }

        parent.setLeftChild(null);
    }

    public void spliceOut(Node node) {
        Node child = node.getLeftChild();
        Node parent = node.getParent();
        if (child == null)
            child = node.getRightChild();

        if (child != null)
            child.setParent(parent);

        if (node == parent.getRightChild()) {
            parent.setRightChild(child);
            return;
        }

        parent.setLeftChild(child);
    }

    public void rotateOut(Node node) {
        if (node == null)
            return;

        Node successor = node.successor();
        spliceOut(successor);
        node.setKey(successor.getKey());
    }

    public Node getRoot() {
        return root;
    }
}
