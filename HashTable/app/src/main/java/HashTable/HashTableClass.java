package HashTable;

import org.w3c.dom.Node;

public class HashTableClass {

    public class LinkedList {
        //Class to represent the linkedList that holds the key: value pair and a pointer that indicates to the next node.
        String key, value;
        Node next;
    }

    //Array of type linkedList class
    LinkedList[] arrayOfLinkedList;


    //Initialize the array with a given size that has been passed as an argument to this method.
    public void HashTable(int initialSize) {
        if (initialSize <= 0) {
            throw new IllegalArgumentException("Illegal table size");
        }
        arrayOfLinkedList = new LinkedList[initialSize];
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
        }

    }
}
