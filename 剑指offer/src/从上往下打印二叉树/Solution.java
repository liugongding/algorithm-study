package src.从上往下打印二叉树;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述：
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。

 * 函数介绍：
 * queue.poll();将队头的元素找到并删除
 * queue.isEmpty 指的是queue里面的内容是否为空
 * queue == null 指的是queue这个引用是否为空

 * 解题思路：
 * 我们从根节点出发，将其添加到队列中，将当前节点的值放到list中，并删除当前节点
 * 若当前节点的左右子节点不为空，则将其添加到队列中
 * @date 2019/12/1 16:10
 * Version 1.0
 */
public class Solution {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            arrayList.add(currentNode.val);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return arrayList;
    }

    @Test
    public void test(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        ArrayList list = PrintFromTopToBottom(treeNode1);
        list.forEach(System.out::println);
    }

}
