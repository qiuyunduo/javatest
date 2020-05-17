package testaboutRE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppRE {

    public static Pattern p1 = Pattern.compile("\\.+");

    public static void main(String[] args) {
        String str = "我...w...要..要.吃...吃...饭";
        Matcher matcher = p1.matcher(str);
        while(matcher.find())
            if(!matcher.group().isEmpty()) {
                System.out.println(matcher.group());
            }
    }
}
