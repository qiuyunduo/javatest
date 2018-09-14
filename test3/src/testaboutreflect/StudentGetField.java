package testaboutreflect;

import java.lang.reflect.Field;

/**
 * @Author: qiuyunduo
 * @Description: * 获取成员变量并调用：
 *
 * 1.批量的
 *      1).Field[] getFields():获取所有的"公有字段"
 *      2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 *      1).public Field getField(String fieldName):获取某个"公有的"字段；
 *      2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 *
 *   设置字段的值：
 *      Field --> public void set(Object obj,Object value):
 *                  参数说明：
 *                  1.obj:要设置的字段所在的对象；
 *                  2.value:要为字段设置的值；
 * @Date: Created in 上午11:43 18-5-30
 * @Modified: null
 */
public class StudentGetField {
    public static void main(String[] args) throws Exception {
        //加载Class对象
        Class aclass = Class.forName("testaboutreflect.Student");

        //获取字段
        System.out.println("************获取所有公有的字段********************");
        Field[] fields = aclass.getFields();
        for (Field field: fields) {
            System.out.println(field);
        }
        System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
        fields = aclass.getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field);
        }
        System.out.println("*************获取公有字段**并调用***********************************");
        Field field = aclass.getField("name");
        System.out.println(field);
        //获取一个对象
        Object o = aclass.getConstructor().newInstance();//产生Student对象--》Student stu = new Student();

        //为字段值设值
        field.set(o,"小明");//为Student对象中的name属性赋值--》stu.name = "刘德华"
        Student stu = (Student)o;
        System.out.println("name="+stu.name);

        System.out.println("**************获取私有字段****并调用********************************");
        field = aclass.getDeclaredField("phoneNum");
        field.setAccessible(true);//暴力反射，解除私有限定
        field.set(o,"18888888");
        System.out.println("phoneNum="+stu.getPhoneNum());
    }
}
