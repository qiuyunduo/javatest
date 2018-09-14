package homework.student;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:46 18-5-29
 * @Modified: null
 */
public class Student {
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showInfo()
    {
        System.out.println("姓名：　"+name);
        System.out.println("年龄：　"+age);

    }
}
