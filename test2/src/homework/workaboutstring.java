package homework;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:50 18-5-27
 * @Modified: null
 */
public class workaboutstring {
    //判断字符串是否对称(回文字符串)
    public static boolean Stringissymmetry(String str)
    {
        boolean b = false;
        int i = 0;
        if(str.length()%2 != 0)
            i = 1;
        String str1 = str.substring(0,str.length()/2);
        String str2 = str.substring(str.length()/2+i);
        str2 = reverseString(str2);
        if(str1.equals(str2))
            b = true;
        System.out.println(str1+"  "+str2);
        return b;
    }
    //判断字符串是否对称(回文字符串)
    public static boolean StringBufferissymmetry(StringBuffer str)
    {
        boolean b = false;
        /*
            StringBuffer类的reverse方法用于 将此字符序列用其反转形式取代
       注意：StringBuffer str = new StringBuffer("test");
            StringBuffer str1 = str;
            当我们改变str ,str1也会随之改变
             str.append('w');
             System.out.println(str+"   "+str2);
             结果并不是输出：testw   test;
            结果输出： testw   testw。
         */
        StringBuffer str1 = new StringBuffer(str.substring(0));
        if(str1.toString().equals( str.reverse().toString()))
            b = true;
        System.out.println(str1+"  "+str);;
        return b;
    }

    public static String reverseString(String str)
    {
        char[] ch = str.toCharArray();
        char temp;
        for (int i = 0; i < ch.length/2; i++)
        {
            temp = ch[i];
            ch[i] = ch[ch.length-i-1];
            ch[ch.length-i-1] = temp;
        }

        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        //将字符串＂jdk＂所有字母大写
        String str1 = "jdk";
        char ch2[] = str1.toCharArray();
        for(int i = 0; i < ch2.length; i++)
            ch2[i] = Character.toUpperCase(ch2[i]);
        str1 = String.valueOf(ch2);
        System.out.println(str1);
        //将test改为tset
        String str2 = "test";
        str2 = reverseString(str2);
//        StringBuffer str2 = new StringBuffer("test");
//        str2 = str2.reverse();
        System.out.println(str2);
        //判断StringBuffer字符串是否对称
        StringBuffer str3 = new StringBuffer("1234567890987654321");
        System.out.println(StringBufferissymmetry(str3));
        //判断String字符串是否对称
        String str4 = "1234567890987654321";
        System.out.println(Stringissymmetry(str4));
        //分割字符串
        String str5 = "113@ ere qqq yyui";
        str5 = str5.replace("@","");
        String[] strs = str5.split("\\s+");
        for(String str0 : strs)
            System.out.println(str0);
        //一段文本中的各个单词的字母顺序翻转
        String str6 = "To be or not to be";
        String[] strs1 = str6.split(" +");
        str6 = "";
        int f=0;
        for(String str0 : strs1){
            if (f == 1)
                str6 += " ";
            f = 1;
            str6 += reverseString(str0);
        }
        System.out.println(str6);
        //拆分字符串
        String str7="  name=zhangsan age=18 classNo=090728";
        str7 = str7.trim();
        String[] strs2 = str7.split(" +");
        for ( String str: strs2 ) {
            int index = str.indexOf("=");
            System.out.print(str.substring(index+1)+"  ");
        }
        System.out.println();

    }
}
