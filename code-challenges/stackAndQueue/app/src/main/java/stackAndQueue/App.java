/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println("======================");

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(12);
        stack.push(29);



        stack.pop();
        stack.peek();
        stack.isEmpty();
        System.out.println("Top value : " + stack.top.value);



        /*
        ====================================================================
        */



        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(5);
        queue.enqueue(12);
        queue.enqueue(27);
        queue.enqueue(50);

    }
}
