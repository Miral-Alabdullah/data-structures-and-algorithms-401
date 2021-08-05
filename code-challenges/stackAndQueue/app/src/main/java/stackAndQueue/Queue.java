package stackAndQueue;

public class Queue<T> {
    Node<T> front = null;
    Node<T> rear = null;

    public void enqueue(T value){
        Node<T> newNode = new Node<T>(value);

        if(front == null) {
            front = newNode;
        }
        else {
            newNode.next = front.value;
        }

        System.out.print(newNode.value);
        System.out.print(" -> ");
        System.out.println(newNode.next);
    }
}
