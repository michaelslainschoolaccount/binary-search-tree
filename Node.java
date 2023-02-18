public class Node {
    private Node parent;
    private Node leftChild;
    private Node rightChild;
    private int key;

    public Node() {
        key = 0;
    }

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public Node getParent() {
        return parent;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setParent(Node node) {
        parent = node;
    }

    public void setLeftChild(Node node) {
        leftChild = node;
    }

    public void setRightChild(Node node) {
        rightChild = node;
    }

    public Node minimum() {
        Node out = this;

        while (out.getLeftChild() != null)
            out = out.getLeftChild();

        return out;
    }

    public Node successor() {
        Node out = this;

        if (out.getRightChild() != null)
            return out.getRightChild().minimum();

        Node parent = out.getParent();
        while (parent != null && out == parent.getRightChild()) {
            out = parent;
            parent = out.getParent();
        }

        return out;
    }

    public int childCount() {
        int sum = 0;

        if (leftChild != null)
            sum++;
        if (rightChild != null)
            sum++;

        return sum;
    }

    public void printWalk() {
        System.out.println(stringWalk());
    }

    public String stringWalk() {
        String out = "";

        if (leftChild != null)
            out += leftChild.stringWalk();
        out += " " + key + "\n";
        if (rightChild != null)
            out += rightChild.stringWalk();

        return out;
    }
}