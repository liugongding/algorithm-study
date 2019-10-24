package src.重建二叉树;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author liudingding
 * @ClassName ReConstructBinaryTree
 * @description 这里介绍一个jdk的函数 Arrays.copyOfRange(T[] original,int from,int to)
 * 将原数组 original,从下标 from 开始，下表 to 结束，注意是左闭右开，即不包含下标 to 的元素，进行复制
 * @date 2019/10/24 10:14
 * Version 1.0
 */
public class Solution {

    /**
     * 这里前序遍历和中序遍历的数组作为入参
     *
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }

        //前序遍历总是从根节点开始的
        //从细节方面看，我们可以把每个节点都看做是一个根节点
        //每一次递归调用我们都把pre前序遍历的根节点赋值了
        TreeNode root = new TreeNode(pre[0]);

        //找根节点，根节点的左边是左子树，右边是右子树
        //而在前序遍历中每次遍历的子树的第一个节点就是根节点
        for (int i = 0; i < in.length; i++) {
            //找到根节点的位置
            if (in[i] == pre[0]) {
                // 左子树，注意左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                // 左子树，注意左闭右开
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return root;
    }

    @Test
    public void test() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        System.out.println(reConstructBinaryTree(pre, in));
    }
}
