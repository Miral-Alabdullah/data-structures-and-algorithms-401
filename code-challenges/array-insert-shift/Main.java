import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arrayOfNumbers = {5,3,4,12,52,78,30};
        System.out.println(Arrays.toString(insertShiftArray(arrayOfNumbers, 22)));

    }

    public static int[] insertShiftArray (int[] arr, int num) {
        int [] newArray = new int[arr.length+1];
        for (int i=0; i<newArray.length; i++) {
            if (i < arr.length / 2) {
                newArray[i] = arr[i];
            } else if (i == arr.length / 2) {
                newArray[i] = num;
            } else {
                newArray[i] = arr[i - 1];
            }
        }
        return newArray;
    }
}