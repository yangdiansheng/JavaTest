package algorithm.sort;

public class InsertSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            //查找插入位置
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = value;//插入数据
        }
    }

    public static void sort2(int[] arr){
        for (int i = 1; i < arr.length ; i++){
            for (int j =i; j > 0; j--){
                if (arr[j -1] > arr[j]){
                    Utils.exchange(arr,j-1 ,j);
                } else{
                    break;
                }
            }
        }
    }
}
