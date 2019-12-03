package src.二叉搜索树与双向链表;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 题目描述；
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 解题思路：
 * 先中序遍历二叉树，然后将改变指针的指向
 * @date 2019/12/3 14:40
 * Version 1.0
 */
public class Solution {
    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }

        findTreeNode(pRootOfTree);
        return addTreeNode(arrayList);
    }

    public void findTreeNode(TreeNode currentNode){
        if (currentNode != null) {
            Convert(currentNode.left);
            arrayList.add(currentNode);
            Convert(currentNode.right);
        }
    }

    public TreeNode addTreeNode(ArrayList<TreeNode> arrayList){
        for (int i = 0; i < arrayList.size() - 1; i++) {
            arrayList.get(i).right = arrayList.get(i+1);
            arrayList.get(i+1).left = arrayList.get(i);
        }
        return arrayList.get(0);
    }

    @Test
    public void test(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode4.left = treeNode3;
        treeNode4.right = treeNode6;
        treeNode3.left = treeNode1;
        treeNode3.right = treeNode2;
        treeNode6.right = treeNode5;
        Convert(treeNode4);
        arrayList.forEach(item -> System.out.println(item.val));
    }
}
