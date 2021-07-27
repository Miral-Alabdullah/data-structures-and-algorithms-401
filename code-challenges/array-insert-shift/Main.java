public class Main {
    public static void main(String[] args){
        insertShiftArray();
    }

    public static void insertShiftArray () {
        int [] arr = {5,3,4,12};
        int [] newArray = new int[arr.length+1];

        for (int i=0; i<newArray.length; i++){
            if(i<arr.length/2){
                newArray[i]=arr[i];
            } else if (i==arr.length/2){
                newArray[i]=25;
            } else {
                newArray[i]=arr[i-1];
            }
        }

        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[2]);
        System.out.println(newArray[3]);
        System.out.println(newArray[4]);
    }
}