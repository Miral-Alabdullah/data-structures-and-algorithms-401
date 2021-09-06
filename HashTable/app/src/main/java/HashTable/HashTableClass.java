package HashTable;




public class HashTableClass {

    public static class LinkedList {
        //Class to represent the linkedList that holds the key: value pair and a pointer that indicates to the next node.
        String key, value;
        LinkedList next;

        public LinkedList(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public LinkedList(){
            this.next = null;
        }
    }

    //Array of type linkedList class
    LinkedList[] arrayOfLinkedList;


    //Initialize the array with a given size that has been passed as an argument to this method.
    public void HashTable(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("Illegal table size");
        }
        arrayOfLinkedList = new LinkedList[initialSize];
        for (int i = 0; i < arrayOfLinkedList.length; i++) {
            arrayOfLinkedList[i] = new LinkedList();
        }
    }


    //Hash function is used for hashing the key to get the index.
    public int Hash(String key) {
        String keyToUse = key.toLowerCase();
        int ascii = 0, index;
        for (int i = 0; i < keyToUse.length(); i++) {
            ascii += keyToUse.charAt(i); //get the chars of the String and convert each into an integer to get its ASCII Code.
            System.out.println("ASCII Code of " + keyToUse.charAt(i) + " = " + ascii);
        }
        //To get the index, this formula gets the sum of ascii values for each key and get the remainder of the division.
        index = ascii % arrayOfLinkedList.length;
        System.out.println("index : " + index);
        return index;
    }

    public void add(String key, String value) throws Exception {
        if (key == null) {
            throw new Exception("The Key Can't Be Null");
        } else {
            int index = Hash(key);
            LinkedList list = arrayOfLinkedList[index];
            LinkedList newItem = new LinkedList(key, value);
            newItem.next = list.next;
            list.next = newItem;
            System.out.println(newItem.value);
        }
    }

    public String get(String key){
        String value = null;
        int index = Hash(key);
        LinkedList list = arrayOfLinkedList[index];
        while (list.next != null){
            if (list.key == key){
                value = list.value;
                break;
            }
            list = list.next;
        }
        System.out.println(list.value);
        return value;
    }

    public boolean contains(String key) {
        int index = Hash(key);
        LinkedList list = arrayOfLinkedList[index];
        while (list != null) {
            if (list.key == key)
                return true;
            list = list.next;
        }
         return false;
    }


}
