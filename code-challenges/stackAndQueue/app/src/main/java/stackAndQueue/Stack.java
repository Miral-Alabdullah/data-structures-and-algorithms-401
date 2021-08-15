package stackAndQueue;


public class Stack<T> {
    public Node<T> top ;


    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        if(top == null){
            top = newNode;
        } else{
        newNode.next = top;
        top = newNode;
        }
    }

    public T pop() throws Exception {
        T value = null;
        if (top == null){
            throw new Exception("This stack is empty");
        } if(top != null){
            value = top.value;
            top= top.next;
        }
        return value;
    }

    public T peek() throws Exception {
        if (top==null){
            throw new Exception("This stack is empty");
        }
        return top.value;
    }

    public boolean isEmpty() {
        if(top == null){
//            System.out.println("Is the stack empty? " + true);
            return true;
        }
//            System.out.println("Is the stack empty? " + false);
            return false;
    }

}

