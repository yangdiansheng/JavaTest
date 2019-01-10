package algorithm.sort;

import algorithm.search.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5, 6, 8, 8, 8, 11, 18};
        for (int a : arr) {
            System.out.print(a + "，");
        }
        System.out.println();
        System.out.println("--------------");
        System.out.print(BinarySearch.searchLastSmallOrEqualsPosition(arr, 7));
    }
}
