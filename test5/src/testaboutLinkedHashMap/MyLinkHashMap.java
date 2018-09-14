package testaboutLinkedHashMap;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:44 18-6-5
 * @Modified: null
 */
public class MyLinkHashMap {
    public static void main(String[] args) {
        MyLinkHashMap mlhm = new MyLinkHashMap();

        LinkedHashMap<Integer,User> users = new LinkedHashMap<Integer, User>();

        users.put(1,mlhm.new User("张三",25));
        users.put(2,mlhm.new User("李四",22));
        users.put(3,mlhm.new User("王五",28));
        System.out.println(users);
        HashMap<Integer,User> newusers = sortHaskMap(users);
        System.out.println(newusers);

    }

    public static HashMap<Integer,User> sortHaskMap(LinkedHashMap lhm)
    {
        Set<Map.Entry<Integer,User>> set = lhm.entrySet();
//        System.out.println(set);

        ArrayList<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer,User>>(set);

        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge()-o1.getValue().getAge();
            }
        });

        LinkedHashMap<Integer,User> link = new LinkedHashMap<>();

        for (Map.Entry<Integer,User> entry:list) {
            link.put(entry.getKey(),entry.getValue());
        }
        return link;
    }

    public class User{
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
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
