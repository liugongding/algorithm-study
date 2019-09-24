package 二叉树;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-23
 */
public class BinaryTree {

    //根节点
    TreeNode root;

    /**
     * 获取根节点
     * @return
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * 设置根节点
     * @param root
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 前序遍历
     */
    public void frontShow() {
        root.frontShow();
    }

    /**
     * 中序遍历
     */
    public void midShow() {
     root.midShow();
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        root.afterShow();
    }

    /**
     * 前序查找
     * @return
     */
    public TreeNode frontSearch(int value) {
        //这个查找都是从根节点开始的
        return root.frontSearch(value);
    }
}
