package testaboutIo;

import java.util.Scanner;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:33 18-5-25
 * @Modified: null
 */
public class Scannertest {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        System.out.println(in.next());
        String str = "Hello";
        String str1 = "World";
        str = str.concat(str1);
        System.out.println(str);
        String str2 = "1234567@qq.com";
        int index = str2.indexOf(".");
        int index1 = str2.lastIndexOf('@');
        System.out.println(index+"  "+index1);
        String sub = str2.substring(index+1,str2.length());
        System.out.println(sub);
    }
}
