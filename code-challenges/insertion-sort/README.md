# Insertion Sort 

The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list (in the same array).

<br>

**Pseudocode**

```
  InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
```

<br>


**Trace**

<br>

Sample Array: [5,-12,23,-4]

![](./insertion-sort.png)

<br>

**Efficency**

 * Time: O(n^2)
 
 * Space: O(n)
        
