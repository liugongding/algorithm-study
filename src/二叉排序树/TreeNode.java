package 二叉排序树;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-24
 */
public class TreeNode {
    private int value;
    TreeNode leftNode;
    TreeNode rightNode;


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

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }

    public void add(TreeNode node) {
        if (node == null) {
            return;
        } else {
            //判断传入节点的值是否比当前字符的根节点的值大还是小
            if (node.value < this.value) {
                //往左子树添加节点
                if (this.leftNode == null) {
                    this.leftNode = node;
                } else {
                    //给当前节点的左儿子再添加一个传进来的节点
                    this.leftNode.add(node);
                }
            } else {
                //往右子树添加节点
                if (this.rightNode == null) {
                    this.rightNode = node;
                } else {
                    //给当前节点的右儿子在添加一个传进来的节点
                    this.rightNode.add(node);
                }
            }
        }
    }

    public TreeNode lookup(int value) {
        //当前节点是根节点
        TreeNode currentNode = this;
        if (currentNode.value == value) {
            //如果查找的值是根节点、直接返回
            return currentNode;
        } else {
            while (currentNode.value != value) {
                //判断入参是否大于当前节点的值
                if (value > currentNode.value) {
                    //从右子树查找
                    currentNode = currentNode.rightNode;
                } else {
                    //从左子树查找
                    currentNode = currentNode.leftNode;
                }
            }
            //当入参等于当前节点的值、就不进入while循环
            return currentNode;
        }
    }

    public void midShow(TreeNode node) {
       if (node != null){
           midShow(node.getLeftNode());
           System.out.println(node.value);
           midShow(node.getRightNode());
       }
    }

    public void preTraverseBTree() {
        System.out.println(this.value);
        if (leftNode != null) {
            leftNode.preTraverseBTree();
        }
        if (rightNode != null) {
            rightNode.preTraverseBTree();
        }
    }
}
