package homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: qiuyunduo
 * @Description:
 * 已知字符串"The last French hostage held by Islamist militants, Serge Lazarevic"
        1)统计该字符串中字母s出现的次数
        2)取出第4个单词
        3)将字符串的每个单词的首字母大写。并输出结果
 * @Date: Created in 下午4:42 18-5-27
 * @Modified: null
 */
public class workaboutstring2 {
    public static void main(String[] args) {
        String str = "The last French hostage held by Islamist militants, Serge Lazarevic";
        String str1 = str;
        String str2 = str;
        int counts = 0;
        while(str1.indexOf('s') >= 0){
            str1 = str1.substring(str1.indexOf('s')+1);
            counts++;
        }
        while(str2.indexOf('S') >= 0){
            str2 = str2.substring(str2.indexOf('S')+1);
            counts++;
        }
        System.out.println("该字符串中字符ｓ出现的次数为：　"+counts);
        String[] strs = str.split(" ");
        System.out.println("第四个单词为：　"+strs[3]);
        for (String str0:strs) {
            str0 = str0.replaceFirst(String.valueOf(str0.charAt(0)),
                    String.valueOf(Character.toUpperCase(str0.charAt(0))));
            System.out.println(str0);
        }


    }
}
