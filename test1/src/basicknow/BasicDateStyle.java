package basicknow;

public class BasicDateStyle {
    //声明byte类型变量
    byte b = 1;
    //声明short类型变量
    short s = 2;
    //声明int类型变量
    int i = 023;
    //声明long类型变量
    long l = 0x4FL;
    long l1 = 65535*65535;
    //声明boolean类型变量,且初始值为true
    boolean bl = true;
    public static void main(String[] args)
    {
        int sums = 0;
        for(int i = 1; i < 100; i++)
            sums += i;
        System.out.println("1+2+...+99 = "+sums);
        long result = 0;
        long f = 1;
        for(int j = 1; j <= 15 ; j++) {
            f *= j;
            result += f;
        }
        System.out.println("long类型计算结果：　"+result);
    }

}
