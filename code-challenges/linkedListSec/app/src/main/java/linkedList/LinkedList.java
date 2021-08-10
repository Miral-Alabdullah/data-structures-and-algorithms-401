package linkedList;

import java.util.Objects;

public class LinkedList {

    public Node head;
    public Node current;
    public Node currentTwo;

    public LinkedList (){
        this.head = null;
    }

    public int insert (int value) {
        Node newNodeInstance = new Node(value);
        if (head != null) {
            newNodeInstance.next = head;
        }
        head = newNodeInstance;
        System.out.println(newNodeInstance.value);
        return value;
    }

    public boolean includes(int value) {
        current = head;

        while (current.next != null){
            if (current.value == value){
                System.out.print("Does " + value + " exist? ");
                System.out.println(true);
                return true;
            }
            current = current.next;
//            System.out.println("Last node inside the while : " + current.value + " " + current.next);
        }
        if (current.value == value){
            System.out.print("Does " + value + " exist? ");
            System.out.println(true);
            return true;
        }
//        System.out.println("Last node inside the while : " + current.value + " " + current.next);

        System.out.print("Does " + value + " exist? ");
        System.out.println(false);
        return false;
    }

    public String toString() {
        current = this.head;
        String formattedValues = "";
        while (current != null){
//            System.out.print(formattedValues);
            formattedValues += "{ " + current.value + " } -> ";
            current = current.next;
        }

        formattedValues = formattedValues + String.valueOf((Object) null).toUpperCase();
        System.out.println(formattedValues);

        return formattedValues;
    }

    public void append (int value){
        Node newNodeInstance = new Node(value);
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

    public void insertBefore(int value, int newValue){
        current = head;
        Node newNode = new Node(newValue);
        if(head.value == value){
            newNode.next = head;
            head = newNode;
        }
        while (current.next != null && current.value != value && current.next.value != value){
            current = current.next;
        }
        if (current.next != null) {
            if(current.next.value == value){
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void insertAfter (int value, int newValue){
        current = head;
        Node newNode = new Node(newValue);
        while (current.next != null && current.value != value){
            current = current.next;
        }
        if(current.value == value){
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int kthFromEnd(int k){
        current = head;
        Node trackerNode = head;
        int count = 0;
        if(k<0){
            throw new IndexOutOfBoundsException();
        }
        try{
            while(count <= k){
                current = current.next;
                count++;
            }
        while (current != null){
            current = current.next;
            trackerNode = trackerNode.next;
        }
        }catch (Exception e){
            throw new IndexOutOfBoundsException();
        }
        System.out.println("\n" + k + "th Node from the last contains: " + Objects.requireNonNull(trackerNode).value);
        return trackerNode.value;
    }

    public LinkedList zipLists(LinkedList list1, LinkedList list2){
        current = list1.head;
        currentTwo = list2.head;
        LinkedList newList = new LinkedList();

        while (current != null || currentTwo != null){
            if(current != null){
                newList.append(current.value);
                current = current.next;
            } if(currentTwo != null) {
                newList.append(currentTwo.value);
                currentTwo = currentTwo.next;
            }
        }
//        System.out.println(newList);

        return newList;
    }
}
