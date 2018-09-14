package testaboutstring;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:02 18-5-25
 * @Modified: null
 */
public class StringBufferTest {
    public static void main(String[] args) {
        /*
            一个字符串是对称的，为回文字符串，即反转前后字符串不变
         */
        StringBuffer str = new StringBuffer("123404321");
        int indexs = str.indexOf("1");
        str.reverse();
        str.append("welcome"); //在字符串末尾追加
        str.insert(2,"flag");//在指定位置插入字符串
        System.out.println(str);
    }
}
