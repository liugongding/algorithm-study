package src.数组中出现次数超过一半的数字;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution2
 * @description
 * @date 2019/12/10 15:32
 * Version 1.0
 */
public class Solution2 {

    public int MoreThanHalfNum_Solution(int[] nums) {
        int majority = nums[0];
        for (int i = 1, cnt = 1; i < nums.length; i++) {
            cnt = nums[i] == majority ? cnt + 1 : cnt - 1;
            if (cnt == 0) {
                majority = nums[i];
                cnt = 1;
            }
        }
        int cnt = 0;
        for (int val : nums)
            if (val == majority)
                cnt++;
        return cnt > nums.length / 2 ? majority : 0;
    }

    @Test
    public void test(){
        int[] array = { 1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));


    }
}
