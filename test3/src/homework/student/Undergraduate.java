package homework.student;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:50 18-5-29
 * @Modified: null
 */
public class Undergraduate extends Student {
    private String specialty;
    public Undergraduate(String name, int age,String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    public void showInfo()
    {
        System.out.println("姓名：　"+super.name);
        System.out.println("年龄：　"+super.age);
        System.out.println("专业：　"+this.specialty);

    }
}
