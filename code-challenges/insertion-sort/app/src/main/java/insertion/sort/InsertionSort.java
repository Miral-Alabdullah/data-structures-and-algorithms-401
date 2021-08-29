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
            System.out.println("i : " + i);

            System.out.println("j : " + j);
            System.out.println("temp : " + temp);

            while(j>=0 && temp<arr[j]){
                arr[j+1] = arr[j];
                System.out.println("arr[j] : " + arr[j]);
                System.out.println("arr[j+1] : " + arr[j+1]);
                j = j-1;
                System.out.println("J : " + j);
                arr[j+1] = temp;
                System.out.println("arr[j+1] : " + arr[j+1]);
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    
}
