package testaboutserializable;

import java.io.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:22 18-6-8
 * @Modified: null
 */
public class Person implements Serializable {
    private final static long serialVersionUID = 1L;

    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("张三",18,'男');
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("data.dat"));
        oos.writeObject(person);

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("data.dat"));
        Person person1 = (Person)ois.readObject();
        System.out.println(person1.getName()+" "+person1.getAge()+" "+person1.getSex());
    }
}
