package testaboutstring;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:27 18-5-25
 * @Modified: null
 */
public class StringTest {
    public static void main(String[] args) {
        String str4 = "";
        System.out.println(str4.length());
        /*
        将一个字符串的首字母大写
         */
        String Str = "hello";
        Str = Str.replaceAll(".","#");
        System.out.println(Str);
        char[] ch = Str.toCharArray();
        if(ch[0] >= 'a' && ch[0] <= 'z')
            ch[0] -= 32;
        Str = String.valueOf(ch);
        System.out.println(Str);
        System.out.println(String.valueOf(ch));
        String str = "aaa";
        String str1 = "aaa";
        String str2 = new String("aaa");
        String str3 = new String("aaa");
        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str2 == str3);
        char ch1 = 'a';
        ch1 = Character.toUpperCase(ch1);
        System.out.println(ch1);


    }
}
