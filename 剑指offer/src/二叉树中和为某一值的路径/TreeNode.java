package src.二叉树中和为某一值的路径;

/**
 * @author liudingding
 * @ClassName TreeNode
 * @description
 * @date 2019/12/2 17:20
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
