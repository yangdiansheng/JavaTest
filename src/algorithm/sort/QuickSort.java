package algorithm.sort;

public class QuickSort {
    public static void sort(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i, j, temp;
        temp = arr[left];//存储基准值
        i = left;
        j = right;
        while (i != j) {
            //从右边开始找,找到比基准值大的就j--
            while (i < j && arr[j] >= temp) {
                j--;
            }
            //从左边开始找，找到比基准值小的就i++
            while (i < j && arr[i] <= temp) {
                i++;
            }
            //交换i ,j位置
            if (i < j) {
                Utils.exchange(arr, i, j);
            }
        }
        //将基数归位
        arr[left] = arr[i];
        arr[i] = temp;
        //递归调用
        sort(arr, left, i - 1);
        sort(arr, i + 1, right);
    }


    public static void sort2(int[] arr) {
        innerSort2(arr, 0, arr.length - 1);
    }

    private static void innerSort2(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int partition = partition(arr, left, right);
        innerSort2(arr, left, partition - 1);
        innerSort2(arr, partition + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int temp = arr[left];
        while (i != j) {
            while (i < j && arr[j] > temp) {
                j--;
            }
            while (i < j && arr[i] <= temp) {
                i++;
            }
            if (i < j){
                Utils.exchange(arr,i,j);
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;
        return i;
    }

}
