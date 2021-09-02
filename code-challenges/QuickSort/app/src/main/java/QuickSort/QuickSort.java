package QuickSort;

import java.util.Arrays;

public class QuickSort {

    public void QuickSortMethod(int[] arr, int left, int right) throws Exception {
        if(arr.length == 0){
            throw new Exception("Empty Array");
        }
        if(left<right){
            int position = Partition(arr, left, right);

            QuickSortMethod(arr, left, position-1);
            QuickSortMethod(arr, position+1, right);
        }
    }

    public int Partition(int[] arr, int left, int right){
        int pivot = arr[right];

        int low = left-1;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot){
                low++;
                Swap(arr, i, low);
            }
        }
        Swap(arr, right, low + 1);
        return low + 1;
    }

    public void Swap(int[] arr, int i, int low){
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

    }
}
