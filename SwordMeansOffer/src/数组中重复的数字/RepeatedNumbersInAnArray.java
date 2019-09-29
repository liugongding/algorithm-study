package 数组中重复的数字;

import org.junit.Test;

/**
 * @Description https://github.com/CyC2018/CS-Notes/blob/master/notes/%E5%89%91%E6%8C%87%20Offer%20%E9%A2%98%E8%A7%A3%20-%203~9.md
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * <p>
 * Input:
 * {2, 3, 1, 0, 2, 5}
 * Output:
 * 2
 * @Author liugongding
 * @Date 2019-09-27
 */
public class RepeatedNumbersInAnArray {

    public boolean duplicate(int numbers[],int length,int [] duplication) {
        //遍历数组
        for (int i = 0; i < length; i++) {
            //我们一直把数组下标对应的值和数组下标对应的值的值进行交换
            while (i != numbers[i]) {
                // {1,1}
                // numbers[1] == numbers[numbers[1]]
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                //TODO 交换
                swap(numbers, i, numbers[i]);
            }
        }
        return false;
    }

    public void swap(int[] arr, int i, int result) {
        int temp = arr[i];
        arr[i] = arr[result];
        arr[result] = temp;
//        arr[i] =arr[i] ^ arr[result];
//        arr[result] = arr[result] ^ arr[i];
//        arr[i] = arr[i] ^ arr[result];
    }

    @Test
    public void RepeatedNumbersInAnArray() {
//        int[] numbers = {2, 3, 1, 1, 4,0};
        int[] numbers = {3, 2, 5, 4,5,4,5,6};
        int[] duplication = {0};
        duplicate(numbers, numbers.length, duplication);
        System.out.println(duplicate(numbers, numbers.length, duplication));
    }


}
