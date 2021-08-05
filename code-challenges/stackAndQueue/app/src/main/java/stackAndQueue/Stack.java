package stackAndQueue;

public class Stack<T> {
    Node<T> top = null;


    public T push(T value) {
        Node<T> newNode = new Node<T>(value);
        if(top == null){
            top = newNode;
        }
        newNode.next = top.value;
        top = newNode;

        return value;
    }

    public T pop(){
        top.value= top.next;

        return top.value;
    }

    public T peek(){
        if (top==null) System.out.println("Exception message : The stack iss empty");



        System.out.println("Peek for the top : " + top.value);
        return top.value;
    }

    public boolean isEmpty() {
        if(top == null){
            System.out.println("Is the stack empty? " + true);
            return true;
        } else
            System.out.println("Is the stack empty? " + false);
            return false;
    }
}
