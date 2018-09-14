package homework.compare;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:39 18-5-29
 * @Modified: null
 */
public class Compare {
    public Compare(int a, int b)
    {
        System.out.println("两个正整数较大的为：　"+(a>b?a:b));
    }

    public Compare(double a, double b)
    {
        System.out.println("两个double型数乘积为：　"+String.format("%.2f",a*b));
    }

    public Compare(String a, String b)
    {
        System.out.println("两个字符串值是否相同：　"+a.equals(b));
    }

    public static void main(String[] args) {
        Compare c1 = new Compare(34,42);
        Compare c2 = new Compare(3,1.2);
        Compare c3 = new Compare("zhang","qiu");

    }
}
