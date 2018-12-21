package search;

public class BinarySearch {

    //二分查找，查找的数组必须有序
    public static int rank(int[] a,int key) {
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if (a[mid] > key) {
                hi = mid - 1;
            } else if (a[mid] < key ){
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    //二分查找递归写法
    public static int rank2(int[] a,int key){
        return rank2(a,key,0,a.length - 1);
    }

    public static int rank2(int[] a,int key,int lo,int hi){
        if (lo > hi)
            return -1;
        int mid = lo + (hi - lo)/2;
        if (key > a[mid]){
            return rank2(a,key,mid + 1,hi);
        } else if (key < a[mid]){
            return rank2(a,key,lo,mid - 1);
        } else {
            return mid;
        }
    }

    //查找第一个等于给定值的元素
    public static int searchFirstPosition(int[] arr,int key){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = lo + ((hi - lo) >> 1);
            if (key > arr[mid]){
                lo = mid + 1;
            } else if (key < arr[mid]){
                hi = mid - 1;
            } else {
                if (mid == 0 || arr[mid - 1] != key){
                    return mid;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    //查找最后一个值等于给定值得元素
    public static int searchLastPostion(int[] arr,int key){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = lo + ((hi - lo) >> 1);
            if (key > arr[mid]){
                lo = mid + 1;
            } else if (key < arr[mid]){
                hi = mid - 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != key){
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    //查找第一个大于给定值的元素3,4,6,7,10中查找大于等于5的元素，那就是6
    public static int searchFirstBigOrEqualsPosition(int[] arr,int key){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = lo + ((hi - lo) >> 1);
            if (key <= arr[mid]){
                if (mid == 0 || arr[mid - 1] < key){
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    //查找最后一个小于等于给定值的元素
    public static int searchLastSmallOrEqualsPosition(int[] arr,int key){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi){
            int mid = lo + ((hi - lo) >> 1);
            if (key >= arr[mid]){
                if (mid == arr.length - 1 || arr[mid + 1] > key){
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }


}
