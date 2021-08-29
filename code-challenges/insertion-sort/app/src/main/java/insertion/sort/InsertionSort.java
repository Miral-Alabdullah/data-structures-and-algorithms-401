package insertion.sort;

import java.util.Arrays;

public class InsertionSort {

    public int[] insertionSort(int[] arr) throws Exception {
        int j;
        int temp;
        if(arr.length == 0){
            throw new Exception("The array is empty!");
        }
        for(int i=1; i<arr.length; i++){
            j = i-1;
            temp = arr[i];

            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    
}
