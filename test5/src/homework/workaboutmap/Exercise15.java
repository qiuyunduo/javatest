package homework.workaboutmap;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:54 18-6-5
 * @Modified: null
 */
public class Exercise15 {
    public static void main(String[] args) {
        Exercise15 e15 = new Exercise15();
        double ages = 0.0;
        List list = new ArrayList();  //存储所有学生信息
        Set setclass = new HashSet();  //存储每个班级的名称
        Map<String,List<Student>> mapstu = new HashMap<>(); //以map形式存储班级及相同班级中的学生

        list.add(e15.new Student("Tom",18,100d,"class05"));
        list.add(e15.new Student("Jerry",22,70d,"class04"));
        list.add(e15.new Student("Owen",25,90d,"class05"));
        list.add(e15.new Student("Jim",30,80d,"class05"));
        list.add(e15.new Student("Steve",28,66d,"class06"));
        list.add(e15.new Student("Kevin",24,100d,"class04"));

        for (Object o :list ) {
            Student s = (Student)o;
            ages += s.getAge();

            setclass.add(s.getClassNum());  //得到所有的班级名称
        }

        System.out.println("所有学生的平均年龄为:"+ages/list.size());
        //初始化班级及学生map
        for (Object o :setclass ) {
            mapstu.put(o.toString(),new ArrayList<>());
        }

        //将相同班级的学生放在同一个List中
        for (Object o : list) {
            Student s1 = (Student)o;
            mapstu.get(s1.getClassNum()).add(s1);
        }

        for (Object o :setclass ) {
            double counts = 0;
            for (Object obj : mapstu.get(o)) {
                Student s2 = (Student)obj;
                counts += s2.getScore();
            }
            System.out.println(o+"的平均分为: "+counts/mapstu.get(o).size());
        }


    }

    public class Student{
        private String name;
        private int age;
        private double score;
        private String classNum;

        public Student(String name, int age, Double score, String classNum) {
            this.name = name;
            this.age = age;
            this.score = score;
            this.classNum = classNum;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Double getScore() {
            return score;
        }

        public String getClassNum() {
            return classNum;
        }
    }
}
