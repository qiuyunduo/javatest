package homework.workaboutcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午11:47 18-6-4
 * @Modified: null
 */
public class Exercise11 {
    public static void main(String[] args) {
        Exercise11 e11 = new Exercise11();

        TreeMap<Integer ,Student> treeMap = new TreeMap();
        treeMap.put(123,e11.new Student(123,"z1"));
        treeMap.put(126,e11.new Student(126,"z4"));
        treeMap.put(125,e11.new Student(125,"z3"));
        treeMap.put(127,e11.new Student(127,"z5"));
        treeMap.put(124,e11.new Student(124,"z2"));


        Set set = treeMap.keySet();

        int len = treeMap.size();
        Student[] stus = new Student[len];
        for (Object o :set ) {
            stus[--len] = (Student)treeMap.get((Integer)o);
        }
        for (int i = 0; i <stus.length ; i++) {
            System.out.println("key: "+stus[i].getNum()+" value: "+stus[i]);

        }

        Iterator it = set.iterator();
        int len1 = treeMap.size();
        System.out.println(len1);
        Student[] stus1 = new Student[len1];

        while (it.hasNext())
            stus1[--len1] = (Student)treeMap.get((Integer) it.next());

        for (int i = 0; i <stus1.length ; i++) {
            System.out.println("key: "+stus1[i].getNum()+" value: "+stus1[i]);

        }


    }

    public class Student {
        private int num;
        private String name;

        public Student(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "num=" + num +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
