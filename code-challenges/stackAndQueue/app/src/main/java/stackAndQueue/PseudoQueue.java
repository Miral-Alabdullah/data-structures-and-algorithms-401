package stackAndQueue;


public class PseudoQueue<T> {
    Stack<T> stack;
    Stack<T> stack1;

    public PseudoQueue() {
        this.stack = new Stack<T>();
        this.stack1 = new Stack<T>();
    }

    public void enqueue(T value) {
        stack.push(value);
    }


    public T dequeue() throws Exception {
        if(stack1.isEmpty()){
            while (!(stack.isEmpty())){
                stack1.push(stack1.pop());
                System.out.println(stack1.top.value);
            }
        }
//        stack1.pop();
        System.out.println(stack1.top.value);
        return stack1.top.value;
    }


}