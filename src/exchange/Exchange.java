package exchange;

public class Exchange {
    //数组前后倒转
    public static void exchangeArray(int[] a){
        int n = a.length;
        for (int i = 0; i < n/2; i++){
            int temp = a[i];
            a[i] = a[n - 1 -i];
            a[n - 1 -i] = temp;
        }
    }
}
