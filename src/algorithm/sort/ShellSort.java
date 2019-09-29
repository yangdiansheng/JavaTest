package algorithm.sort;

public class ShellSort {
    public static void sort(int[] arr) {
        int N = arr.length;
        int h = 1;
        while(h < N/3){
            h = h*3 +1;
        }
        while (h >= 1){
            for (int i = h; i<N; i++){
                for (int j = i; j >= h; j-=h){
                    if (arr[j -h] > arr[j]){
                        Utils.exchange(arr,j-h,j);
                    }
                }
            }
            h =h/3;
        }
    }
}
