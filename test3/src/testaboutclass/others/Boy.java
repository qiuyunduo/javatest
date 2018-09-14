package testaboutclass.others;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:03 18-5-29
 * @Modified: null
 */
public class Boy {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl)
    {
        System.out.println(this.name + "　和　" + girl.getName() + "结婚了");
    }

    public void shout()
    {
        System.out.println(this.name+" shouting");
    }
}
