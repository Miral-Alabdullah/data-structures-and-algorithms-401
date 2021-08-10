/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        LinkedList newItem = new LinkedList();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        newItem.insert(2);
        newItem.insert(3);
        newItem.insert(6);
        newItem.insert(5);
        newItem.insert(12);
        newItem.insert(32);


        list1.append(1);
        list2.append(5);
        list1.append(3);
        list2.append(9);
        list1.append(2);
        list2.append(4);



        newItem.includes(5);
        newItem.includes(100);
        newItem.includes(32);
        list1.includes(2);
        list2.includes(4);

//        newItem.zipLists(list1, list2);


        newItem.insertBefore(32,5);

        newItem.insertAfter(6,49);
        newItem.insertAfter(2,14);

        newItem.toString();
        System.out.println("\n");
        newItem.zipLists(list1, list2).toString();

//        System.out.println("Head Next : " + newItem.head.next.value);

//
        newItem.kthFromEnd(0);
        newItem.kthFromEnd(8);
//        newItem.kthFromEnd(-1);
    }
}
