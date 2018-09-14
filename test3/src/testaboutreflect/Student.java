package testaboutreflect;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:59 18-5-29
 * @Modified: null
 */
public class Student {
    public static void main(String[] args) {
        System.out.println("调用了Student的main方法");
    }

    //**********字段*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    //----------构造方法----------
    //（默认的构造方法）
    Student(String str) {
        System.out.println("默认的构造方法　s= "+str);
    }
    //无參构造方法
    public Student(){
        System.out.println("调用了共有，无參构造方法执行了．．．");
    }
    //有一个参数的构造方法
    public Student(char name){
        System.out.println("姓名："+name);
    }
    //有二个参数的构造方法
    public Student(String name, int age){
        System.out.println("姓名："+name+"　年龄："+age);
    }

    //受保护的的构造方法
    protected Student(boolean b){
        System.out.println("受保护的构造方法　n = "+b);
    }
    //受保护的的构造方法
    private Student (int age){
        System.out.println("私有的的构造方法　年龄： "+age);
    }

    ////**************成员方法***************//
    public void show1(String s){
        System.out.println("调用了：公有的，String参数的show1() s = "+s);
    }

    protected void show2(){
        System.out.println("调用了：受保护的，无参的show2()");
    }

    void show3(){
        System.out.println("调用了：默认的，无參的show3()");
    }

    private String show4(int age){
        System.out.println("调用了：私有的，并返回值的，int参数的show4() age = "+age);
        return "abcd";
    }
}
