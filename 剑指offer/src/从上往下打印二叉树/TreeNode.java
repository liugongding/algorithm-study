package src.从上往下打印二叉树;

/**
 * @author liudingding
 * @ClassName TreeNode
 * @description
 * @date 2019/12/1 16:10
 * Version 1.0
 */
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

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
