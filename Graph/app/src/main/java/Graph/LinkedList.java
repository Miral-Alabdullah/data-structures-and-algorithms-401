package Graph;

public class LinkedList<T> {
    public Node<T> head;
    public Node<T> current;

    public LinkedList (){
        this.head = null;
    }

    public T insert (T value) {
        Node<T> newNodeInstance = new Node(value);
        if (head != null) {
            newNodeInstance.next = head;
        }
        head = newNodeInstance;
        System.out.println(newNodeInstance.value);
        return value;
    }

    public void append (T value){
        Node<T> newNodeInstance = new Node(value);
        current = this.head;
        if(head == null){
            head = newNodeInstance;
        } else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNodeInstance;
        }
    }
}
