package src.二维数组中的查找;

/**
 * @author liudingding
 * @ClassName FindingTwo_DimensionalArray
 * @description
 *
 * 该二维数组中的一个数，小于它的数一定在其左边，大于它的数一定在其下边。
 * 因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间，
 * 当前元素的查找区间为左下角的所有元素。
 * 我们往下移动的时候 行号(row + 1), 列号不变
 * 我们往左移的时候 行号不变, 列号(col - 1)
 * @date 2019/10/7 17:10
 * Version 1.0
 */
public class FindingTwo_DimensionalArray {

    public static boolean Find(int target, int[][] matrix) {
        //行的长度
        int row = matrix.length;
        //列的长度
        int col = matrix[0].length;
        //从右上角开始查找 matrix[r][c]
        int r = 0, c = col - 1;

        while (r <= row - 1 && c >= 0) {
            if (target == matrix[r][c]) {
                System.out.println("存在该元素： " + matrix[r][c]);
                return true;
            } else {
                if (target > matrix[r][c]) {
                    r++;
                } else {
                    c--;
                }
            }
        }
        System.out.println("不存在该元素：" + target);
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15, 16}, {2, 5, 8, 12, 19, 20}, {3, 6, 9, 16, 22, 28}, {10, 13, 14, 17, 24, 33}, {18, 21, 23, 26, 30, 40}};
        Find(2, matrix);
    }
}
