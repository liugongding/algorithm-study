package 二叉树;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-23
 */
public class BinaryTreeTest {

    public static void main(String[] args) {

        //创建一颗二叉树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点交给二叉树
        binaryTree.setRoot(root);

        //创建一个根节点的左儿子
        TreeNode rootL = new TreeNode(2);
        root.setLeftNode(rootL);

        //创建一个根节点的右儿子
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);

        //将权值为2的节点当做根节点，创建一个权值为4的左儿子
        rootL.setLeftNode(new TreeNode(4));
        //将权值为2的节点当做根节点，创建一个权值为5的右儿子
        rootL.setRightNode(new TreeNode(5));

        //将权值为3的节点当做根节点，创建一个权值为6的左儿子
        rootR.setLeftNode(new TreeNode(6));
        //将权值为3的节点当做根节点，创建一个权值为7的右儿子
        rootR.setRightNode(new TreeNode(7));

        //前序遍历
        binaryTree.frontShow();
        System.out.println("————————————————");
        //中序遍历
        binaryTree.midShow();
        System.out.println("—————————————————");
        //后序遍历
        binaryTree.afterShow();
        System.out.println("—————————————————");

        //前序查找
        TreeNode result = binaryTree.frontSearch(1);
        System.out.println(result);
    }
}
