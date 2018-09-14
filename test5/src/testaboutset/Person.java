package testaboutset;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:46 18-6-4
 * @Modified: null
 */
public class Person  implements Comparable{

    private String name;
    private int age;
    private String sex;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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
    @Override
    public String toString() {
        return name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((sex == null) ? 0 : sex.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (sex == null) {
            if (other.sex != null)
                return false;
        } else if (!sex.equals(other.sex))
            return false;
        return true;
    }
    @Override
    public int compareTo(Object o) {
        Person p=(Person) o;
        if(this.age>p.age) {
            return 1;
        }else if(this.age<p.age) {
            return -1;
        }else {
            return 0;
        }
        //return this.age-p.age;
    }





}
