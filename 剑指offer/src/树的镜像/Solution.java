package src.树的镜像;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 操作给定的二叉树，将其变换为源二叉树的镜像
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 * @date 2019/11/21 17:09
 * Version 1.0
 */
public class Solution {

    public TreeNode Mirror(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            swap(root);
            Mirror(root.left);
            Mirror(root.right);
        }
        return root;
    }

    public void swap(TreeNode root){
        TreeNode item = root.left;
        root.left = root.right;
        root.right = item;
    }


    @Test
    public void test(){
        TreeNode treeNode8 = new TreeNode(8);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(9);
        TreeNode treeNode11 = new TreeNode(11);

        treeNode8.left = treeNode6;
        treeNode8.right = treeNode10;
        treeNode6.left = treeNode5;
        treeNode6.right = treeNode7;
        treeNode10.left = treeNode9;
        treeNode10.right = treeNode11;

        System.out.println(Mirror(treeNode8));
    }
}
