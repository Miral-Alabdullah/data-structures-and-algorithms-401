
import java.util.Arrays;

public class Binary {



    public static void main(String[] args) {
        System.out.println("Hello");
//        System.out.println(Arrays.toString(arryOfnumbers));

        int[] arryOfnumbers = {6, 5, 1, 4, 2, 3};
        System.out.println(binarySearch(arryOfnumbers, 4));

    }

    public static int binarySearch(int[] arr, int searchKey) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int first = 0;
        int last = arr.length;

        while(first<last){
            int mid_point = (first+last)/2;
            if (arr[mid_point] == searchKey){
                return mid_point;
            } else if(searchKey<arr[mid_point]){
                last = mid_point-1;
            } else{
                first = mid_point+1;
            }
        }
        return -1;
    }
}