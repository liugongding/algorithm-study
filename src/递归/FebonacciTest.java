package 递归;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-20
 */
public class FebonacciTest {

    public static int febonacci(int i){
        // 1 1 2 3 5 8 13 21 34
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return febonacci(i-1) + febonacci(i-2);
        }
    }

    public static void main(String[] args) {
        int i = febonacci(4);
        System.out.println(i);
    }
}
