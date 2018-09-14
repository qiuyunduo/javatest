package homework.employee;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:57 18-5-29
 * @Modified: null
 */
public class Employee {
    protected String name;
    protected int age;
    protected String nation;

    public Employee()
    {
        System.out.println("sdssd");
        this.name = "无名氏";
        this.age = 0;
        this.nation = "汉族";
    }

    public Employee(String name, int age, String nation) {
        this.name = name;
        this.age = age;
        this.nation = nation;
    }

}
