/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stackAndQueue;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(new App().getGreeting());
//        System.out.println("======================");
//
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(5);
        stack.push(12);
        stack.push(29);
//        stack.toString();
//
//
//        stack.pop();
//        stack.pop();
//        stack.peek();

//        stack.isEmpty();
//        System.out.println("=========================================");
//



        /*
        ====================================================================
        */

//
//
        Queue<Integer> queue = new Queue<Integer>();
//        Queue<Integer> queue1 = new Queue<Integer>();
//

        queue.enqueue(5);
        queue.enqueue(12);
        queue.enqueue(29);
//        queue.toString();
//
//        System.out.print("Top : " + queue.front.value + " -> ");
//        System.out.print("Next : " + queue.front.next.value + " -> ");
//        System.out.println("====================\n");
//        queue.enqueue(50);
//
//        queue.dequeue();
//
//        queue1.isEmpty();
//        queue.isEmpty();

        /*
        ====================================================================
        */


        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<Integer>();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(7);


        pseudoQueue.stack.toString();
        pseudoQueue.dequeue();


        /*
        ====================================================================
        */


        Animal animal = new Animal();
        Cat cat1 = new Cat("NimNim", "Shirazi", 2);
        Cat cat2 = new Cat("MinMin", "Persian", 3);
        Dog dog1 = new Dog("Cooper", "German Shepherd", 1);
        Dog dog2 = new Dog("Ruby", "Husky", 4);

        cat1.toString();
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(cat1);
        animalShelter.enqueue(cat2);

        animalShelter.dequeue(cat1);

    }
}
