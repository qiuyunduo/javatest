package testaboutRE;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:40 18-6-7
 * @Modified: null
 */
public class TestSplit {
    public static void main(String[] args) {
        String str = "publicstaticcc123voidddmain";
        //对表达式进分组重用
//        String ragex1="\\d+"; //匹配数字
        String ragex1="(.)\\1+";
        String[] ss = str.split(ragex1);
        for(String st:ss){
            System.out.println(st);
        }
        //按照两个cc+来截取
        String ragex = " ";
        //切割
        String strs = "publicstaticccvoidddmain";
        String ragexs = "cc+";
        String[] s = strs.split(ragexs);
        for(String SSSS :s){
            System.out.println(SSSS);
        }
        System.out.println("=-=========");

        String str1="wei232123jin234";
        String ragex2 = "\\d{4,5}";
        String newstr = "*";
        String s1 =str1.replaceAll(ragex2, newstr);
        System.out.println(s1);

        String str2 ="wwweiei222222jjjiiinnn1232";
        String ragex3 ="(.)\\1+";
        String newStr ="*";
        String s2 = str2.replaceAll(ragex3, newStr);
        System.out.println(s2);
    }
}
