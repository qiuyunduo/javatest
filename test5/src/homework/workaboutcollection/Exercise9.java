package homework.workaboutcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午11:21 18-6-4
 * @Modified: null
 */
public class Exercise9 {
    public static void main(String[] args) {
        Exercise9 e9 = new Exercise9();
        List list = new ArrayList();

        list.add(e9.new User("z1",12));
        list.add(e9.new User("z6",56));
        list.add(e9.new User("z4",23));
        list.add(e9.new User("z5",34));
        list.add(e9.new User("z2",13));
        list.add(e9.new User("z3",20));

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            User user = (User)list.get(i);
            System.out.print(user.getName()+"  ");

        }
        System.out.println();


    }

    public class User implements Comparable<User>{
        private String name;
        private int age;

        public User(String name, int age) {
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
        public int compareTo(User o) {
            return o.getAge()-age;
        }
    }
}
