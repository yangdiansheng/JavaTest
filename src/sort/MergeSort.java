package sort;

/**
 * 归并排序
 * 分治的方法、从下治上归并以达到有序、分治使用递归实现
 *
 * 递推公式
 * sort(left,right) = sort(mergeSort(left,middle),mergeSort(middle+1,right))
 * 终止条件
 * left >= right 不用继续分解
 */
public class MergeSort {

    public static int[] temp;

    public static void sort(int[] arr) {
        temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }


    private static void merge(int[] arr, int left, int middle, int right) {
        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //剩余元素拷贝到数组中
        while (i <= left) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        //将临时数据元素复制回原数组
        for (i = 0; i < k; i++) {
            arr[left + i] = temp[i];
        }
    }
}
