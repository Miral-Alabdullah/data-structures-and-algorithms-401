
public class LinkedList {

    public Node head;
    public Node current;

    public LinkedList (){
        this.head = null;
    }

    public void insert (int vlaue) {
        Node newNodeInstance = new Node(vlaue);
        current = this.head;
        int count = 0;
        if(head == null){
            head = newNodeInstance;
            System.out.println("head: " + head.value);
        } else {
            while (current.next != null){
                current = current.next;
                count++;
            }
            current.next = newNodeInstance;
            System.out.println(count);
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

    public void append (int value){
        insert(value);
    }

    public void insertBefore(int value, int newValue){
        current = head;
        Node newNode = new Node(newValue);
        while (current.next != null && current.value != value && current.next.value != value){
            current = current.next;
        }
        if(current.next.value == value){
            newNode.next = current.next;
            current.next = newNode;
        }else {
            System.out.println("There is no node that has the value " + value);
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
        while(count <= k){
            current = current.next;
            count++;
//            System.out.print(" current : " + current.value);
//            System.out.println(" counter : " + count);
        }
        while (current != null){
            current = current.next;
            trackerNode = trackerNode.next;
//            System.out.print(" current : " + current.value);
//            System.out.println(" trackerNode : " + trackerNode.value);
        }
        System.out.println(k + "th Node from the last contains: " + trackerNode.value);
        return trackerNode.value;
    }
}