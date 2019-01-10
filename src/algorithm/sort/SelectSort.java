package algorithm.sort;

public class SelectSort {
    //选择排序：从待数组中选择出一个最小放入排序数组中以此类推
    public static void sort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            Utils.exchange(arr, i, minIndex);
        }
    }
}
