package testaboutstring;

public class CompareStr {
    static int a = 1000;  //测试静态变量是否可以改变，实验证明可以被改变
    public static void main(String[] Args){
        String str1 = new String("hello");
        String str2 = new String("hello");
        boolean a1 = (str1.equals(str2));
        boolean a2 = (str1 == str2);
        System.out.println(a1);
        System.out.println(a2);
        a++;
        System.out.println(a );
    }
}
