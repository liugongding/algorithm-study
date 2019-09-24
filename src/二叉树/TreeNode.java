package 二叉树;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-23
 */

public class TreeNode {

    //权值
    private int value;

    //左儿子
    private TreeNode leftNode;

    //右儿子
    private TreeNode rightNode;

    public TreeNode() {
    }

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    /**
     * 前序遍历
     */
    public void frontShow() {
        //输出当前节点的权值
        System.out.println(this.value);

        if (leftNode != null) {
            leftNode.frontShow();
        }
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void midShow() {

        if (leftNode != null) {
            leftNode.midShow();
        }

        //输出当前节点的权值
        System.out.println(this.value);

        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        if (leftNode != null) {
            leftNode.afterShow();
        }
        if (rightNode != null) {
            rightNode.afterShow();
        }
        //输出当前节点的权值
        System.out.println(this.value);
    }

    public TreeNode frontSearch(int value) {
//        TreeNode currentNode = this;
//        if (currentNode.value == value) {
//            return currentNode;
//        } else {
//            while (currentNode.value != value) {
//                if (value > currentNode.value) {
//                    currentNode = currentNode.rightNode;
//                } else {
//                    currentNode = currentNode.leftNode;
//                }
//            }
//            return currentNode;
//        }
        TreeNode target = null;
        if (this.value == value) {
            return this;
        } else {
            if (leftNode != null) {
                target = leftNode.frontSearch(value);
            }
            if (target != null) {
                return target;
            }
            if (rightNode != null) {
                target = rightNode.frontSearch(value);
            }
        }
        return target;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
