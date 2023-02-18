# Binary Search Tree

## Info

-   Author: Michael Slain
-   Acknowledgments: Mr. Kuszmaul

## Node Class Outline

### Attributes:

-   `parent`: The parent node of this node.
-   `leftChild`: The left child node of this node.
-   `rightChild`: The right child node of this node.
-   `key`: The integer key value of this node.

### Methods:

-   `Node()`: Constructor for a node with default key value of 0.
-   `Node(int key)`: Constructor for a node with the given key value.
-   `getKey()`: int: Returns the key value of this node.
-   `getParent()`: Node: Returns the parent node of this node.
-   `getLeftChild()`: Node: Returns the left child node of this node.
-   `getRightChild()`: Node: Returns the right child node of this node.
-   `setKey(int key)`: void: Sets the key value of this node to the given value.
-   ` setParent(Node node)`: void: Sets the parent node of this node to the given node.
-   `setLeftChild(Node node)`: void: Sets the left child node of this node to the given node.
-   `setRightChild(Node node)`: void: Sets the right child node of this node to the given node.
-   `minimum()`: Node: Returns the node with the minimum key value in the subtree rooted at this node.
-   `successor()`: Node: Returns the successor node of this node (the node with the next higher key value in the binary search tree).
-   `childCount()`: int: Returns the number of child nodes that this node has.
-   `printWalk()`: void: Prints the tree structure starting from this node in a left-to-right depth-first traversal order.
-   `stringWalk()`: String: Returns a string representing the tree structure starting from this node in a left-to-right depth-first traversal order.

## Binary Tree Class Outline

### Constructors:

-   `public BinaryTree()`: creates an empty binary tree with a root node that has a key value of 0.
-   `public BinaryTree(Node node)`: creates a binary tree with the given node as its root.

### Basic methods:

-   `public Node search(int key)`: searches for the node in the tree with the given key value and returns it.
-   `public void insert(Node node)`: inserts the given node into the binary tree.
-   `public void delete(Node node)`: deletes the given node from the binary tree.

### Helper methods:

-   `public Node searchHelper(Node node, int key)`: recursively searches for the node in the tree with the given key value and returns it.
-   `public Node findInsertionNode(int key)`: finds the node where a new node with the given key value should be inserted in the binary tree.
-   `public boolean childless(Node node)`: checks if the given node is childless (has no children).
-   `public boolean oneChild(Node node)`: checks if the given node has only one child.
-   `public void scrubParent(Node node)`: removes the given node from the tree by scrubbing its parent's reference to it.
-   `public void spliceOut(Node node)`: removes the given node from the tree by splicing its child (if any) into its parent's reference to it.
-   `public void rotateOut(Node node)`: removes the given node from the tree by rotating in its successor node.

### Getters:

-   `public Node getRoot()`: returns the root node of the binary tree.

## Dev

```zsh
java Main.java
```
