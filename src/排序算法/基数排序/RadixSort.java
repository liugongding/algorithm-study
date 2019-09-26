package 排序算法.基数排序;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-26
 */
public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 6, 189, 45, 9, 287, 56, 1, 789, 34, 65, 652, 5};
        radixSort(arr);
    }
}
