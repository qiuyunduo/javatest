package testaboutreflect;

/**
 * @Author: qiuyunduo
 * @Description: * 获取Class对象的三种方式
 * 1 Object ——> getClass();
 * 2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
 * 3 通过Class类的静态方法：forName（String  className）(常用)
 * @Date: Created in 下午7:33 18-5-29
 * @Modified: null
 */
public class StudentGetClass {
    public static void main(String[] args) {
        //第一种方式获取Class对象
        Student stu = new Student();  //这一个new产生了一个Student对象，一个Class对象
        Class stuClass = stu.getClass();  //获得Class对象
        System.out.println(stuClass.getName());

        //第二种方式获取Class对象
        Class stuClass1 = Student.class;
        System.out.println(stuClass == stuClass1); //判断第一种方式获取Class对象和第二种方式获取的对象是否是同一个

        //第三种方式获取Class对象
        try {
            Class stuClass2 = Class.forName("testaboutreflect.Student");
            System.out.println(stuClass == stuClass1); //判断第三种方式获取的对象是否是同一个
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
