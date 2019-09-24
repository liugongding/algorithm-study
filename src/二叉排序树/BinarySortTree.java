package 二叉排序树;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-24
 */
public class BinarySortTree {

    TreeNode root;

    public BinarySortTree(){}

    public BinarySortTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 想二叉树添加节点
     * @param node
     */
    public void add(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    @Override
    public String toString() {
        return "BinarySortTree{" +
                "root=" + root +
                '}';
    }

    public TreeNode lookup(int value) {
        return root.lookup(value);
    }

    public void minShow() {
            root.midShow(root);
    }

    public void preTraverseBTree(){
        root.preTraverseBTree();
    }
}
