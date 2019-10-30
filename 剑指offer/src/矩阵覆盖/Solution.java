package src.矩阵覆盖;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
 * 总共有多少种方法？
 * @date 2019/10/24 15:44
 * Version 1.0
 */
public class Solution {

    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        } else {
            return RectCover(target -1) + RectCover(target - 2);
        }
    }
}
