package algorithm.sort;

/**
 * 归并排序
 * 分治的方法、从下治上归并以达到有序、分治使用递归实现
 * <p>
 * 递推公式
 * sort(left,right) = sort(mergeSort(left,middle),mergeSort(middle+1,right))
 * 终止条件
 * left >= right 不用继续分解
 */
public class MergeSort {

    public static void mergeSort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        mergeRecursive(arr, result, 0, len - 1);

    }

    private static void mergeRecursive(int[] arr, int[] result, int start, int end) {
        if (start >= end) {
            return;
        }
        int len = end - start;
        int mid = (len >> 1) + start;
        mergeRecursive(arr, result, start, mid);
        mergeRecursive(arr, result, mid + 1, end);
        merge(arr,result,start,mid,end);
    }

    private static void merge(int[] arr,int[] result,int start,int mid,int end){
        int start1 = start;
        int end1 = mid;
        int start2 = mid + 1;
        int end2 = end;
        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            result[k++] = arr[start1++];
        }
        while (start2 <= end2) {
            result[k++] = arr[start2++];
        }
        for (k = start; k <= end; k++) {
            arr[k] = result[k];
        }
    }


}
