# Hashtables

Hash Table is a data structure which stores data in an associative manner. In a hash table, data is stored in an array format, where each data value has its own unique index value. Access of data becomes very fast if we know the index of the desired data.

## Challenge

Write an implementation for the following methods in Hash Table : 

  - add()

  - hash()

  - get()

  - contains()

## Approach & Efficiency


  - add()

    * Time : O(1)

    * Space : O(1)

  - hash()

    * Time : O(n)

    * Space : O(1)

  - get()

    * Time : O(n)

    * Space : O(1)

  - contains()

    * Time : O(n)

    * Space : O(1)


## API


  - add() => To insert a key: value pair to the array of nodes.

  - hash() => Hashing function which convert the given key into an index number.  

  - get() => To get the key: value pair from the array by the given key.

  - contains() => It checks if the given key exists in the array, it is a boolean method that return either true or false. 