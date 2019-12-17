package 数组;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description
 * @Author liugongding
 * @Date 2019-09-18
 */
public class ArrayTest {

    /**
     * 往数组里面添加元素
     */
    @Test
    public void addElement() {
        int[] arr = new int[]{9, 8, 7};
        //查看数组里面的元素 Arrays.toString
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        int element = 6;

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        //这里newArr[3]是第4个元素
        newArr[arr.length] = element;
        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr);
        //新数组替换成原来的数组
        arr = newArr;
        System.out.println(arr);
    }

    /**
     * 删除元素
     */
    @Test
    public void deleteElement() {
        //创建数组时、指明数组大小
        int[] arr = new int[]{9, 8, 7, 6, 5, 4};
        System.out.println(Arrays.toString(arr));
        //删除数组元素的下标
        int dst = 3;
        int[] newArr = new int[arr.length - 1];
        //从要删除的数组下标开始分割
        for (int i = 0; i < newArr.length; i++) {
            if (i < dst) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 将元素插入到指定位置
     */
    @Test
    public void addLocationElement() {
        //创建数组时、指明数组大小
        int[] arr = new int[]{9, 8, 7, 6, 5, 4};
        //插入数组元素的下标
        int dst = 3;
        //需要添加的元素
        int element = 99;
        int[] newArr = new int[arr.length + 1];
        //将添加的数组下标进行分割
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < dst) {
                newArr[i] = arr[i];
            }
            if (i == dst) {
                newArr[dst] = element;
            }
            if (i > dst) {
                newArr[i] = arr[i - 1];
            }
        }
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 将元素插入指定位置
     */
    @Test
    public void addLocationElement2(){
        //创建数组时、指明数组大小
        int[] arr = new int[]{9, 8, 7, 6, 5, 4};
        //插入数组元素的下标
        int dst = 3;
        //需要添加的元素
        int element = 99;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < dst) {
                newArr[i] = arr[i];
            } else {
                newArr[i+1] = arr[i];
            }
        }
        newArr[dst] = element;
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 线性查找
     */
    @Test
    public void queryArrays(){
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        //要查找的元素
        int element = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                System.out.println("数组下标：" + i);
                return;
            }
        }
    }

    /**
     * 二分查找
     */
    @Test
    public void dichotomy(){
        int[] arr = new int[]{0,1,2,3,4,5,6,7,8,9};
        //目标元素
        int target = 8;
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (true) {
            //判断中间元素是不是要查找的元素
            if (arr[mid] == target) {
                System.out.println("数组下标：" + mid + "," + "数组元素：" + arr[mid]);
                return;
            } else {
                //判断目标元素是否比中间元素大
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    //中间这个元素已经找过了、把他前移一位
                    end = mid - 1;
                }
            }
            mid = (start + end) / 2;
        }
    }
}
