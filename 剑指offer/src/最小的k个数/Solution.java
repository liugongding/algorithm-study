package src.最小的k个数;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * @date 2019/12/11 10:35
 * Version 1.0
 */
public class Solution {


    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(k<= 0 || k > input.length)return result;
        //初次排序，完成k个元素的排序
        for(int i = 1; i< k; i++){
            int j = i-1;
            int unFindElement = input[i];
            while(j >= 0 && input[j] > unFindElement){
                input[j+1] = input[j];
                j--;
            }

            input[j+1] = unFindElement;
        }
        //遍历后面的元素 进行k个元素的更新和替换
        for(int i = k; i < input.length; i++){
            if(input[i] < input[k-1]){
                int newK = input[i];
                int j = k-1;
                while(j >= 0 && input[j] > newK){
                    input[j+1] = input[j];
                    j--;
                }
                input[j+1] = newK;
            }
        }
        //把前k个元素返回
        for(int i=0; i < k; i++)
            result.add(input[i]);
        return result;
    }

    @Test
    public void test(){
        int[] input = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> result = GetLeastNumbers_Solution(input,4);
        result.forEach(System.out::println);
    }
}
