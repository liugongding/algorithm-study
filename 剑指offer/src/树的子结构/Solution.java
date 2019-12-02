package src.树的子结构;

import java.util.Scanner;

/**
 * @author liudingding
 * @ClassName Solution
 * @description
 * @date 2019/11/21 8:32
 * Version 1.0
 */
public class Solution {

    static String fileName;
    static String email;
    static Scanner scanner = new Scanner(System.in);

    /**
     * 校验是否为java文件
     * @param fileName
     */
    public static void verifyIsJava(String fileName) {
        while (true) {
            int index = fileName.lastIndexOf(".");
            if (index != -1 && fileName.substring(index+1).equals("java")) {
                break;
            }
            System.out.println("输入不合法,请重新输入");
            fileName = scanner.nextLine();
        }
        System.out.println("校验成功，请进行下一步操作");
    }

    /**
     * 校验是否为Email
     * @param email
     */
    public static void verifyIsEmail(String email) {
        String index = email.substring(email.length() - 7);
        if (index == "@qq.com" && index != null) {
            System.out.println("校验成功");
        } else {
            System.out.println("输入非法字符串，请重新运行");
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入java文件名");
        fileName = scanner.nextLine();
        verifyIsJava(fileName);
        System.out.println("请输入qq邮件");
        email = scanner.nextLine();
        try {
            verifyIsEmail("1051533375@qq.com");
        } catch (Exception e) {
            System.out.println("输入非法字符串，请重新运行");
        }
    }
}
