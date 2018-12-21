package sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Utils.exchange(arr, j, j + 1);
                }
            }
        }
    }

    public static void sort2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;//提前退出排序标志
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    Utils.exchange(arr, j, j + 1);
                    flag = true;//表示有数据交换
                }
            }
            if (!flag)//没有数据交换提前退出
                break;
        }
    }
}
