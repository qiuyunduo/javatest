package basicknow;

class  A
{
    {
        System.out.println("A类的非静态代码段");
    }
    static{
        System.out.println("A类的静态代码段");
    }
    public A(){
        System.out.println("A类的构造函数");
    }
}
public class HelloWorld extends A{
    {
        System.out.println("HelloWorld类的非静态代码段");
    }
    static{
        System.out.println("HelloWorld类的静态代码段");
    }
    public HelloWorld(){
        System.out.println("HelloWorld类的构造函数");
    }

    public static void main(String[] Args){
        System.out.println("start...");
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("end...");

    }
}
