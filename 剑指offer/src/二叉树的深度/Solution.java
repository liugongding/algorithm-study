package src.二叉树的深度;

import org.junit.Test;


/**
 * @author liudingding
 * @ClassName Solution
 * @description 题目描述：
 * 输入一棵二叉树，求该树的深度
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度
 * <p>
 * *     	     1
 * *     	   /   \
 * *     	  2     3
 * *     	 / \   / \
 * *     	4  5  6  7
 * *       /
 * *      8
 * @date 2019/12/17 20:12
 * Version 1.0
 */
public class Solution {

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = TreeDepth(root.left);
        int r = TreeDepth(root.right);
        return Math.max(l + 1, r + 1);
    }

    @Test
    public void test() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode4.left = treeNode8;

        System.out.println(TreeDepth(treeNode1));
    }

}
