package homework.student;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:52 18-5-29
 * @Modified: null
 */
public class Graduate extends Student {
    private String studydirection;
    public Graduate(String name, int age,String studydirection) {
        super(name, age);
        this.studydirection = studydirection;
    }

    public void showInfo()
    {
        System.out.println("姓名：　"+super.name);
        System.out.println("年龄：　"+super.age);
        System.out.println("研究方向：　"+this.studydirection);
    }
}
