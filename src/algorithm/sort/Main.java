package algorithm.sort;


import static algorithm.sort.ShellSort.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 4, 30, 6, 8, 10, 8, 11, 18};
        for (int a : arr) {
            System.out.print(a + "，");
        }
        System.out.println();
        System.out.println("--------------");
        sort(arr);
        for (int a : arr) {
            System.out.print(a + "，");
        }
    }
}
