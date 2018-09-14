package testaboutclass.banking.exercise8.Test;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:08 18-5-29
 * @Modified: 简单的设计模式－单例模式
 */
public class SingletonPattern {

    private double r;
    private static SingletonPattern sp;

    private SingletonPattern() {
        r = java.lang.Math.random();
    }

    public static SingletonPattern getinstance() {
        if (sp == null) {
            sp = new SingletonPattern();
        }
        return sp;
    }

    public double getr() {
        return r;
    }

    public static void main(String[] args) {

        SingletonPattern sp1 = SingletonPattern.getinstance();
        SingletonPattern sp2 = SingletonPattern.getinstance();
        System.out.println(sp1.getr());
        System.out.println(sp2.getr());
    }
}
