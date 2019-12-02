package src.二叉搜索树的后序遍历;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 *
 * 解题思路：
 * 首先后序遍历的根节点肯定是最后一个节点 i , 左子树 < 根节点 < 右子树
 * 小于 i 的结点都是左子树，大于 i 的结点都是右子树
 * 如果我们发现右子树中有小于根结点 i 的结点，返回false，说明不是后序遍历
 * 这时候我们再递归遍历左子树和右子树，左子树和右子树同时返回true的时候，才说明该序列为二叉搜索树的后序遍历序列
 * 我们还要考虑边界情况，就是遍历的时候容易出现空树的情况 -> start >= end
 * @date 2019/12/2 14:49
 * Version 1.0
 */
public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return verify(sequence, 0, sequence.length-1);
    }

    public boolean verify(int[] sequence, int start, int end) {
        //考虑边界条件,递归临界点
        //if(start >= end)
        if (end - start <= 1) {
            return true;
        }
        int root = sequence[end];
        int index;
        int i;
        //找到左子树的临界点
        for (index = start; index < end; index++) {
            if (sequence[index] > root) {
                break;
            }
        }
        //查找右子树，判断右子树的每一个结点是否小于根节点
        //如果不是，返回false
        for (i = index; i < end; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }
        boolean left = verify(sequence, start, index-1);
        boolean right = verify(sequence, index, end - 1);
        return left && right;
    }

    @Test
    public void test(){
        int [] sequence = {3, 4, 9, 5, 12, 11, 10};
        System.out.println(VerifySquenceOfBST(sequence));
    }
}
