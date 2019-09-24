package 二叉排序树;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-24
 */
public class BinarySortTreeTest {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 1, 5, 9, 12};

        BinarySortTree binarySortTree = new BinarySortTree();
        for (int value : arr) {
            binarySortTree.add(new TreeNode(value));
        }
        System.out.println(binarySortTree);

        System.out.println(binarySortTree.lookup(3));

        System.out.println("中序遍历");
        binarySortTree.minShow();

        System.out.println("前序遍历");
        binarySortTree.preTraverseBTree();
    }
}
