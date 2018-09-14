package homework.workaboutcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午11:32 18-6-4
 * @Modified: null
 */
public class Exercise10 {
    public static void main(String[] args) {
        Exercise10 e10 = new Exercise10();

        Set set = new HashSet();

        set.add(e10.new Person("z1",14));
        set.add(e10.new Person("z1",15));
        set.add(e10.new Person("z1",16));
        set.add(e10.new Person("z2",17));
        set.add(e10.new Person("z3",18));
        System.out.println("利用foreach输出set");
        for (Object o :set ) {
            Person p = (Person)o;
            System.out.println(p.getName()+" "+p.getAge());
        }

        System.out.println("利用Iterator输出set");
        Iterator it = set.iterator();
        while (it.hasNext()){
            Person p1 = (Person)it.next();
            System.out.println(p1.getName()+" "+p1.getAge());
        }


    }

    public class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {

            return (int)name.hashCode();
        }
    }
}
