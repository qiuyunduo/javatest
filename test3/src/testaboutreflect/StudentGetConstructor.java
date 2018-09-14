package testaboutreflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: qiuyunduo
 * @Description:  通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
 *
 *      1.获取构造方法：
 *      1).批量的方法：
 *          public Constructor[] getConstructors()：所有"公有的"构造方法
public Constructor[] getDeclaredConstructors()：获取所有的构造方法(包括私有、受保护、默认、公有)

 *      2).获取单个的方法，并调用：
 *          public Constructor getConstructor(Class... parameterTypes):获取单个的"公有的"构造方法：
 *          public Constructor getDeclaredConstructor(Class... parameterTypes):获取"某个构造方法"可以是私有的，或受保护、默认、公有；
 *
 *          调用构造方法：
 *          Constructor-->newInstance(Object... initargs) l
 * @Date: Created in 下午7:56 18-5-29
 * @Modified: null
 */
public class StudentGetConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.加载Class对象
        Class aClass = Class.forName("testaboutreflect.Student");

        //2.获取所有的共有构造方法
        System.out.println("**********************所有公有构造方法*********************************");
        Constructor[] conArray = aClass.getConstructors();
        for (Constructor con :conArray) {
            System.out.println(con);
        }

        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        conArray = aClass.getDeclaredConstructors();
        for (Constructor con :conArray) {
            System.out.println(con);
        }

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor con = aClass.getConstructor( char.class);
        System.out.println("con = "+con);

        //调用构造方法
        Object obj = con.newInstance('w');
//        System.out.println("obj = "+obj);
//        Student str = (Student)obj;

        System.out.println("******************获取私有构造方法，并调用*******************************");
        con = aClass.getDeclaredConstructor(int.class);
        System.out.println(con);
        //调用私有构造方法
        con.setAccessible(true); //暴力访问（忽略修饰符）
        obj = con.newInstance(18);


    }

}
