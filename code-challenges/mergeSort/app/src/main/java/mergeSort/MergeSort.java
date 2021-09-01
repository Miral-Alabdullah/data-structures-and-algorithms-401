package mergeSort;

import java.util.Arrays;

public class MergeSort {


    public int[] mergeSort(int[] arr) throws Exception {
        int n = arr.length;
        if(n == 0){
            throw new Exception("This Array is Empty!!");
        }

        if(n>1){
            int mid = arr.length/2;
            System.out.println(mid);
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, n);


            // Keep Dividing the subArrays [left],[right].
            mergeSort(left);
            mergeSort(right);

            merge(left, right, arr);

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public void merge(int[] left, int[] right, int[] arr){
        int i = 0; // left index
        int j = 0; // right index
        int k = 0; // main index

        while (i < left.length && j < right.length){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            } else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length){
            arr[k] = right[j];
            k++;
            j++;
        }
    }

}


