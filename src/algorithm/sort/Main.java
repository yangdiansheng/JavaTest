package algorithm.sort;



public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 4, 30, 6, 8, 10, 8, 11, 18};
        for (int a : arr) {
            System.out.print(a + "，");
        }
        System.out.println();
        System.out.println("--------------");
        QuickSort.sort2(arr);
        for (int a : arr) {
            System.out.print(a + "，");
        }
    }
}
