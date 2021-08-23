package tree;

public class Node2 {
    int value;
    Node2 leftChild;
    Node2 rightChild;

    public Node2(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node2 getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node2 leftChild) {
        this.leftChild = leftChild;
    }

    public Node2 getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node2 rightChild) {
        this.rightChild = rightChild;
    }
}
