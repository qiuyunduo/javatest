package testaboutRE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:30 18-5-27
 * @Modified: null
 */
public class test1 {
    public static void main(String[] args) {
        String str = "How=hisd are 100 you? I am fine=100. 10000 return=12345 ok!";
        String pstr = "(?<==)\\S+(?= )";  //"(\\D*)(\d+)
        String str1 = "H.*!";
        System.out.println(str.matches(str1));
        Pattern pattern = Pattern.compile(pstr);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find())
            if(!matcher.group().isEmpty())
                System.out.println(matcher.group());

        String phone="14970061084";
        String regex = "1[34578]\\d{9}]";
        System.out.println(phone.matches(regex));
    }
}
