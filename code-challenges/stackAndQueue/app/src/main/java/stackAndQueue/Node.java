package stackAndQueue;

public class Node<T> {
    public T value;
    public T next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}
