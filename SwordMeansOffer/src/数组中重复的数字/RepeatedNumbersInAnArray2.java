package 数组中重复的数字;

import org.junit.Test;

/**
 * @Description
 *  * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 *  * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
 *  * 请找出数组中任意一个重复的数字。
 *  * <p>
 *  * Input:
 *  * {2, 3, 1, 0, 2, 5}
 *  * Output:
 *  * 2
 * @Author liugongding
 * @Date 2019-09-29
 */
public class RepeatedNumbersInAnArray2 {



    public boolean duplicate(int numbers[],int length,int [] duplication) {

        //新建一个数组，我们把原来数组中有的值进行一个标记，
        //如果该值已经标记过了，我们认为该值已经重复
        int[] counts = new int[length];
        //遍历数组
        for (int i = 0; i < length; i++) {
            if (counts[numbers[i]] == 1) {
                duplication[0] =numbers[i];
                return true;
            }
            //标记数组中的值
            counts[numbers[i]]++ ;
        }
        return false;
    }
    @Test
    public void RepeatedNumbersInAnArray() {
        int[] numbers = {2, 3, 1, 0, 2, 5};
        int[] duplication = {0};
        duplicate(numbers, numbers.length, duplication);
        System.out.println(duplicate(numbers, numbers.length, duplication));

    }
}
