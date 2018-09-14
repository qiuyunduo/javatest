package homework;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:24 18-5-27
 * @Modified: null
 */
public class workaboutstring3 {
    public static void main(String[] args) {
        String str = "as well as other constants and methods";
        String[] strs = str.split(" ");
        String maxstr = "";
        System.out.println("这句话中的单词数为：　"+strs.length);
        for (String str1 : strs) {
            if(str1.length() > maxstr.length() )
                maxstr = str1;
        }
        System.out.println("这句话中字母最长的单词为：　"+maxstr);

        String str2 = "aassswwcddooceffopiuuopueoczmmjhbvv";
        System.out.println(str2);
        for(int i = 0; i < str2.length(); i++)
            if(str2.indexOf(str2.charAt(i)) == str2.lastIndexOf(str2.charAt(i))) {
                System.out.println("该字符串中最早出现，并只出现一次的字符为：　" + str2.charAt(i));
                break;
            }

    }
}
