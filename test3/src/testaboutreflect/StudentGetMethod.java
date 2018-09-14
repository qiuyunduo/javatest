package testaboutreflect;

import java.lang.reflect.Method;

/**
 * @Author: qiuyunduo
 * @Description: 获取成员方法并调用：
 *
 * 1.批量的：
 *      public Method[] getMethods():获取所有"公有方法"；（包含了父类的方法也包含Object类）
 *      public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
 * 2.获取单个的：
 *      public Method getMethod(String name,Class<?>... parameterTypes):
 *                  参数：
 *                      name : 方法名；
 *                      Class ... : 形参的Class类型对象
 *      public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 *
 *   调用方法：
 *      Method --> public Object invoke(Object obj,Object... args):
 *                  参数说明：
 *                  obj : 要调用方法的对象；
 *                  args:调用方式时所传递的实参；
 * @Date: Created in 下午3:11 18-5-30
 * @Modified: null
 */
public class StudentGetMethod {
    public static void main(String[] args) throws Exception {
        //加载Class对象
        Class aClass = Class.forName("testaboutreflect.Student");

        //2.获取所有公有方法
        System.out.println("***************获取所有的”公有“方法*******************");
        Method[] methods = aClass.getMethods();
        for (Method m:methods) {
            System.out.println(m);
        }

        System.out.println("***************获取所有的方法，包括私有的*******************");
        methods = aClass.getDeclaredMethods();
        for (Method m:methods) {
            System.out.println(m);
        }

        System.out.println("***************获取公有的show1()方法*******************");
        Method method = aClass.getMethod("show1", String.class);
        System.out.println(method);
        //实例化一个Student对象
        Object o = aClass.getConstructor().newInstance();
        method.invoke(o,"小明");

        System.out.println("***************获取受保护的show2()方法******************");
        method = aClass.getDeclaredMethod("show2",null);
        System.out.println(method);
        method.invoke(o);

        System.out.println("***************获取私有的show4()方法******************");
        method = aClass.getDeclaredMethod("show4", int.class);
        method.setAccessible(true); //解除私有限定
        System.out.println(method);
        Object result = method.invoke(o, 18);//需要两个参数，一个是要调用的对象（获取有反射），一个是实参
        System.out.println(result);


    }
}
