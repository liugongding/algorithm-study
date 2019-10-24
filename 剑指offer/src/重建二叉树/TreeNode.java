package src.重建二叉树;

/**
 * @author liudingding
 * @ClassName TreeNode
 * @description
 * @date 2019/10/24 10:19
 * Version 1.0
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
