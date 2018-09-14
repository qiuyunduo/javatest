package testaboutclass.others;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:48 18-5-28
 * @Modified: null
 */
public class PersonClass {
    String name;
    private int age;
    private char sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setSex(char sex) {
        if(sex == '男')
            this.sex = '男';
        else
            this.sex = '女';
    }

    public void study()
    {
        System.out.println(this.name+"Studying");
    }

    public void showAgeandSex()
    {
        System.out.println("Age: "+age+", Sex: "+this.sex);
    }

    public void addAge()
    {
        age += 2;
    }

    public static void main(String[] args) {
        PersonClass person = new PersonClass();
        person.name = "张三";
        person.age = 12;
        person.sex = '男';
        person.study();
        person.showAgeandSex();
        person.addAge();
        person.addAge();
        person.showAgeandSex();
        PersonClass person1 = new PersonClass();
        person1.name = "李四";
        person1.age = 18;
        person1.sex = '男';
        person1.study();
        person1.showAgeandSex();
        person1.addAge();
        person1.showAgeandSex();
        PersonClass person2 = new PersonClass();
        person2.setSex('女');
        System.out.println(person2.sex);

    }
}
