package sort;

public class Utils {
    public static void exchange(int[] arr,int positionA,int positionB){
        int temp = arr[positionA];
        arr[positionA] = arr[positionB];
        arr[positionB] = temp;
    }
}
