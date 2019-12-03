package src.二叉树中和为某一值的路径;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 *     	    10
 *     	   /  \
 *     	  5   12
 *     	 / \
 *     	4  7
 * 比如输入目标值target为22，有如下两种情况
 * [10, 5, 7]，[10, 12]
 *
 * 解题思路：
 * 这跟二叉树的先序遍历差不多，我们从根节点开始，每经过一个结点，目标值减去当前结点的值，
 * 并将当前结点添加到 ArrayList<Integer>
 * 如果到根节点的目标值为0，则说明该路径是我们所要的路径，将这条路径的ArrayList<Integer>
 * 添加到ArrayList<ArrayList<Integer>>，此时当target == 0，我们往前回溯一下
 * ArrayList<Integer>.remove(list.size() - 1),回到根节点，在进行递归操作，以此类推
 *
 * @date 2019/12/2 17:20
 * Version 1.0
 */
public class Solution {

    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        find(root,target);
        return arrayLists;
    }
    public void find(TreeNode currentNode, int target){
        if (currentNode == null) {
            return;
        }
        arrayList.add(currentNode.val);
        target = target - currentNode.val;
        if (target == 0 && currentNode.left == null && currentNode.right == null) {
//            arrayLists.add(arrayList);
            arrayLists.add(new ArrayList<>(arrayList));
        } else {
            FindPath(currentNode.left, target);
            FindPath(currentNode.right, target);
        }
        //每回溯一次，将最后一个元素移除
        arrayList.remove(arrayList.size() - 1);
    }

    @Test
    public void test(){
        TreeNode treeNode10 = new TreeNode(10);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode12 = new TreeNode(12);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode10.left = treeNode5;
        treeNode10.right = treeNode12;
        treeNode5.left = treeNode4;
        treeNode5.right = treeNode7;
        ArrayList<ArrayList<Integer>> result = FindPath(treeNode10,22);
        result.forEach(item -> System.out.println(item));
    }

}
