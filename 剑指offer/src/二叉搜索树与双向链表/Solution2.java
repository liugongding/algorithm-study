package src.二叉搜索树与双向链表;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution2
 * @description
 * @date 2019/12/3 15:58
 * Version 1.0
 */
public class Solution2 {

    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        Convert(pRootOfTree, list);
        return Convert(list);

    }
    //中序遍历，在list中按遍历顺序保存
    public void Convert(TreeNode pRootOfTree, ArrayList<TreeNode> list){
        if(pRootOfTree.left != null){
            Convert(pRootOfTree.left, list);
        }

        list.add(pRootOfTree);

        if(pRootOfTree.right != null){
            Convert(pRootOfTree.right, list);
        }
    }
    //遍历list，修改指针
    public TreeNode Convert(ArrayList<TreeNode> list){
        for(int i = 0; i < list.size() - 1; i++){
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).val);
        }
        return list.get(0);

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

    }
}
