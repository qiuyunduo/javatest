package testaboutRE;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:02 18-6-7
 * @Modified: null
 */
public class TestRe1 {
    public static void main(String[] args) {
        String str = "我...w...要..要.吃...吃...饭";
        String regex = "\\.+";
        String newStr = "";
        str= str.replaceAll(regex,newStr);
        System.out.println(str);
        str = str.replaceAll("(.)\\1+","$1");
        System.out.println(str);
    }
}
