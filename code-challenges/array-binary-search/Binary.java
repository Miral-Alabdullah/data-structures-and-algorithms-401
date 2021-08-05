
import java.util.Arrays;

public class Binary {



    public static void main(String[] args) {
        System.out.println("Hello");

//        int[] arrayOfNumbers = {-131, -82, 0, 27, 42, 68, 179};
        int[] arrayOfNumbers = {4, 8, 15, 16, 23, 42};
//        int[] arrayOfNumbers = {5,4,3,9,12};
        System.out.println("Location : " + binarySearch(arrayOfNumbers, 15));

    }

    public static int binarySearch(int[] arr, int searchKey) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int first = 0;
        int last = arr.length;
        int mid_point;
        while(first<last){
            mid_point = (first+last)/2;
            System.out.println("Mid point : " + mid_point);
            if (arr[mid_point] == searchKey){
                return mid_point;
            } else if(searchKey<arr[mid_point]){
                last = mid_point-1;
                return last;
            } else if (searchKey>arr[mid_point]){
                first = mid_point+1;
                return first;
            }
        }
        return -1;
    }
}