public class Test {
    private static int pass = 0, fail = 0;

    public static void run() {

        // test cases for the constructor
        Node node1 = new Node(1);
        Node node2 = new Node(2);

        // test cases for the getKey method
        if (node1.getKey() == 1) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getKey() == 2) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the setKey method
        node1.setKey(3);
        node2.setKey(4);

        if (node1.getKey() == 3) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getKey() == 4) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the getLeftChild method
        if (node1.getLeftChild() == null) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getLeftChild() == null) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the setLeftChild method
        node1.setLeftChild(node2);
        node2.setLeftChild(node1);

        if (node1.getLeftChild() == node2) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getLeftChild() == node1) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the getRightChild method
        if (node1.getRightChild() == null) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getRightChild() == null) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the setRightChild method
        node1.setRightChild(node2);
        node2.setRightChild(node1);

        if (node1.getRightChild() == node2) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getRightChild() == node1) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the childCount method
        if (node1.childCount() == 2) {
            pass++;
        } else {
            fail++;
        }

        if (node2.childCount() == 2) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the getParent method
        if (node1.getParent() == null) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getParent() == null) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the setParent method
        node1.setParent(node2);
        node2.setParent(node1);

        if (node1.getParent() == node2) {
            pass++;
        } else {
            fail++;
        }

        if (node2.getParent() == node1) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the minimum method
        if (node1.minimum() == node1) {
            pass++;
        } else {
            fail++;
        }

        if (node2.minimum() == node2) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the successor method
        if (node1.successor() == node2) {
            pass++;
        } else {
            fail++;
        }

        if (node2.successor() == node1) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the childCount method
        if (node1.childCount() == 2) {
            pass++;
        } else {
            fail++;
        }

        if (node2.childCount() == 2) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the constructor
        BinaryTree tree1 = new BinaryTree();

        // test cases for the insert method
        tree1.insert(new Node(1));
        tree1.insert(new Node(2));

        if (tree1.getRoot().getKey() == 1) {
            pass++;
        } else {
            fail++;
        }

        if (tree1.getRoot().getRightChild().getKey() == 2) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the search method
        if (tree1.search(1) == tree1.getRoot()) {
            pass++;
        } else {
            fail++;
        }

        if (tree1.search(2) == tree1.getRoot().getRightChild()) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the delete method
        tree1.delete(new Node(1));

        if (tree1.getRoot().getKey() == 2) {
            pass++;
        } else {
            fail++;
        }

        // test cases for the getRoot method
        if (tree1.getRoot().getKey() == 2) {
            pass++;
        } else {
            fail++;
        }

        stop();
    }

    private static void stop() {
        // print the results
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
    }
}
