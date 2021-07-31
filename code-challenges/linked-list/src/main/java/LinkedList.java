
public class LinkedList {

    public Node head;
    public Node current;

    public LinkedList (){
        this.head = null;
    }

    public void insert (int vlaue) {
        Node newNodeInstance = new Node(vlaue);
        current = this.head;

        if(head == null){
            head = newNodeInstance;
            System.out.println("head: " + head.value);
        } else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNodeInstance;
            System.out.println("current value : " + current.value);
        }

    }

    public boolean includes(int value) {
        while (current.next != null){
            if (current.value == value){
                System.out.print("Does " + current.value + " exist? ");
                System.out.println(true);
                return true;
            }
            current = current.next;
        }

        System.out.print("Does " + current.value + " exist? ");
        System.out.println(false);
        return false;
    }

    public String toString() {
        current = this.head;
        String formattedValues = "";
        while (current != null){
            System.out.print(formattedValues);
            formattedValues = "{ " + current.value + " }" + " -> ";
            current = current.next;
        }
        formattedValues = formattedValues + String.valueOf(current).toUpperCase();
        System.out.println(formattedValues);
        return formattedValues;
    }

}