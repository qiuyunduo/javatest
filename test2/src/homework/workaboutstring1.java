package homework;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:58 18-5-27
 * @Modified: null
 */
public class workaboutstring1 {
    //将字符串中大写字母小写
    public static String AllTolower(String str){
        StringBuffer strb = new StringBuffer("");
        if(str != null)
            for(int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    strb.append(Character.toLowerCase(ch));
            }
        return strb.toString();
    }
    //将字符串中小写字母大写
    public static String AllToUpper(String str){
        StringBuffer strb = new StringBuffer("");
        if(str != null)
            for(int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if(Character.isLowerCase(ch))
                    strb.append(Character.toUpperCase(ch));
            }
        return strb.toString();
    }
    public static void main(String[] args) {
        String str = "IhLeOllVoEwJorAlVdA";
        StringBuffer newstr1 = new StringBuffer("");
        StringBuffer newstr2 = new StringBuffer("");
        char[] chs = str.toCharArray();
        for (char ch: chs){
            if('A' <= ch && ch <= 'Z') //也可换成Character.isUpperCase(ch)判断该字符是否为大写字母
                newstr1.append(ch);
            else if('a' <= ch && ch <= 'z')
                newstr2.append(ch);
        }
        String str1 = AllTolower(newstr1.toString());
        String str2 = AllToUpper(newstr2.toString());
        System.out.println(newstr1.toString()+"   "+newstr2.toString());
        System.out.println(str1+"   "+str2);
        StringBuffer strb = new StringBuffer(str);
        System.out.println(strb.reverse());
    }
}
