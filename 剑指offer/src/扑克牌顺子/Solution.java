package src.扑克牌顺子;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 *
 * 题目描述：
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，否则就输出false。
 * 为了方便起见,你可以认为大小王是0
 * 题干那么长，具体就是这样的信息，0-13，一共14个数字，0可以充当任何数字，然后输入是五个数字，判断是不是顺子连续的
 *
 * 解题思路：
 * 这里隐含信息就是如果连续，那肯定最大和最小差值为4，因为只有五个数字，加了0也不可能变出花来。
 * 还有一点是，如果数字重复，那么返回错误即可
 * 最后就需要判断0的个数，去除0以后的数组，进行排序，最大和最小的差值必须小于4即可（因为0可能充当头尾数）
 *
 * @date 2019/12/24 19:42
 * Version 1.0
 */
public class Solution {

    public boolean isContinuous(int [] numbers) {
        if (numbers.length != 5) {
            return false;
        }
        Arrays.sort(numbers);
        int count = 0;
        for (int num : numbers) {
            if (num == 0) {
                count++;
            }
        }
//        int max = Arrays.stream(newNums).max().getAsInt();
//        int min = Arrays.stream(newNums).min().getAsInt();
        int max = 0;
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
             max = numbers[numbers.length - 1];
             if (count == 4) {
                 min = 0;
             } else {
                 min = numbers[count];
             }
        }
        boolean result;
        if (max - min <= 4 && max != min) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Test
    public void test(){
        int[] numbers = {3,0,0,0,0};
        System.out.println(isContinuous(numbers));
    }

    @Test
    public void test1(){
        int[] newNums = new int[5];
        newNums[0] = 1;
        newNums[2] = 2;
        newNums[4] = 4;
        Arrays.sort(newNums);
        System.out.println(Arrays.toString(newNums));
        System.out.println(Arrays.stream(newNums).max().getAsInt());
    }
}
