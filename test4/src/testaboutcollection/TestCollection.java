package testaboutcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:38 18-6-4
 * @Modified: null
 */
public class TestCollection {
    public class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            System.out.println("sdsddsdsd");
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {
        Collection cs = new ArrayList();
        cs.add("小明");
        cs.add("小红");
        cs.add("小兰");

        Iterator it = cs.iterator();
        while(it.hasNext()){
             System.out.println(it.next());
        }

        TestCollection tc = new TestCollection();
        Collection cs1 = new ArrayList();
        cs1.add(tc.new Person("小明",18));
        cs1.add(tc.new Person("小红",19));
        cs1.add(tc.new Person("小兰",20));

        Iterator it1 = cs1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }




    }
}
