package homework.employee;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:02 18-5-29
 * @Modified: null
 */
public class Engineer extends Employee {
    private String department;
    private String major;

    public Engineer()
    {
        department = "不详";
        major = "不详";
    }

    public Engineer(String name, int age, String nation,String department,String major)
    {
        super(name,age,nation);
        this.department = department;
        this.major = major;
    }

    public String show()
    {
        return  "department='" + department + '\'' +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' ;
    }

    public static void main(String[] args) {
        Engineer e = new Engineer();
        System.out.println(e.show());
        Engineer e1 = new Engineer("小明",20,"汉族","开发","软件开发");
        System.out.println(e1.show());
    }
}
