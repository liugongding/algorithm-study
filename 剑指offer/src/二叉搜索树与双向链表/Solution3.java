package src.二叉搜索树与双向链表;

import org.junit.Test;

/**
 * @author liudingding
 * @ClassName Solution3
 * @description
 * @date 2019/12/3 18:33
 * Version 1.0
 */
public class Solution3 {
    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode root) {
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        node.left = pre;
        if (pre != null)
            pre.right = node;
        pre = node;
        if (head == null)
            head = node;
        inOrder(node.right);
    }

    @Test
    public void test(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
//        treeNode4.left = treeNode3;
//        treeNode4.right = treeNode6;
//        treeNode3.left = treeNode1;
//        treeNode3.right = treeNode2;
//        treeNode6.right = treeNode5;
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;
        System.out.println(Convert(treeNode2));
    }

}
