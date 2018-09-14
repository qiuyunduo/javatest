package testaboutset;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:43 18-6-4
 * @Modified: null
 */
public class Animal {


    public Animal(int age) {
        super();
        this.age = age;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return age+"";
    }
}