package testaboutabstract.role;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:20 18-5-30
 * @Modified: null
 */
public abstract class Role {
    private String name;
    private int age;
    private String sex;

    public Role()
    {
        name="路人甲";
        age = 18;
        sex = "男";
    }

    public Role(String name, int age, String sex) {
        this();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public abstract void play();


}
