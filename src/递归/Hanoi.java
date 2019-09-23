package 递归;

/**
 * @Description
 * 算法思想：
 * 剧本是这样的，n层的盘子对上面的盘子说：你们全部挪到B柱，我再挪到C柱，然后你们再过来不就行了么。
 * n-1层的盘子说：你说的简单，每次只能挪1个盘呀，我们怎样全部挪到B柱？
 * n层盘子说：笨蛋，反正我最大，你们尽管放在我上面木有问题，你们完全可以无视我的存在。
 * 这样你们n-1个盘全部挪到B柱，与我们n个盘全部挪到C柱所面临的问题不是一样的吗？
 * 都是移柱的问题呀，你们还比我少了一个盘，问题复杂度还简化了呢，你就照样画葫芦就行了。
 * n-1层的盘说：哇塞！说的对！上面n-2个盘听好了，我们现在要全部挪到B柱，你们n-2个盘先全部挪到C柱，我再挪到B柱，然后你们再过来。
 * 这个对话一直往上传直到最顶层，问题简化为1个盘从A柱挪到C柱
 * @Author liugongding
 * @Date 2019-09-23
 */
public class Hanoi {
    static int sum = 0;

    /**
     * 无论有多少个盘子、都认为有两个，上面的盘子和最下面的盘子
     *
     * @param n    共有n个盘子
     * @param from 开始的柱子
     * @param in   中间柱子
     * @param to   目标柱子
     */
    public static void move(int n, String from, String in, String to) {

        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移动到" + to);
//            ++sum;
        } else {
            //移动上面所有的盘子到中间柱子
            // to 即C是辅助柱子
            move(n - 1, from, to, in);
            //移动下面的盘子到目标柱子
            System.out.println("第" + n + "个盘子从" + from + "移动到" + to);
            //把上面所有盘子从中间柱子移动到目标柱子
            // in 即 A是辅助柱子
            move(n - 1, in, from, to);
        }
    }

    public static void main(String[] args) {
        move(3, "A", "B", "C");
//        System.out.println("一共移动"+sum+"次");
    }
}
