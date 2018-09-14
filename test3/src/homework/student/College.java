package homework.student;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:47 18-5-29
 * @Modified: null
 */
public class College extends Student {
    private String school;
    public College(String name, int age,String school) {
        super(name, age);
        this.school = school;
    }

    public void showInfo()
    {
        System.out.println("姓名：　"+super.name);
        System.out.println("年龄：　"+super.age);
        System.out.println("学校：　"+this.school);

    }
}
