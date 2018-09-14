package homework;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:19 18-6-20
 * @Modified: null
 */
public class ReflectTest {
    private String name;
    private int age;
    private String sex;

    public ReflectTest(){

    }

    public ReflectTest(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public ReflectTest(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.age = 18;
    }

    public void show(){
        System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"性别："+sex);
    }

    public static void main(String[] args) throws Exception {

        Class cls = Class.forName("homework.ReflectTest");

        List<String> stus = new ArrayList<String>();
        Class clsl = stus.getClass();

        Method addmethod = clsl.getDeclaredMethod("add",Object.class);

        Constructor con = cls.getConstructor();
        Object obj = con.newInstance();

        Method method = cls.getMethod("setAge",int.class);
        method.invoke(obj,20);

        method = cls.getMethod("show");
        method.invoke(obj);

        Object o = addmethod.invoke(stus,(ReflectTest)obj);

        con = cls.getConstructor(String.class,int.class,String.class);
        obj = con.newInstance("张三",24,"男");

        method.invoke(obj);

        o = addmethod.invoke(stus,(ReflectTest)obj);

        con = cls.getConstructor(String.class,String.class);
        obj = con.newInstance("李四","男");

        method.invoke(obj);

        o = addmethod.invoke(stus,(ReflectTest)obj);

        System.out.println(stus);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String   toString() {
        return "ReflectTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
