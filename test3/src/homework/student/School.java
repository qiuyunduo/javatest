package homework.student;

import java.util.ArrayList;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:55 18-5-29
 * @Modified: null
 */
public class School {
    public static void main(String[] args) {
        ArrayList<Student> stus = new ArrayList<Student>();

        Student s = new Student("小明",18);
        College c = new College("张三",20,"永州技术职业学院");
        Undergraduate u = new Undergraduate("李四",20,"计算机科学与技术");
        Graduate g = new Graduate("王五",20,"软件开发");

        stus.add(s);
        stus.add(c);
        stus.add(u);
        stus.add(g);

        for (Student stu:stus) {
            stu.showInfo();
            System.out.println();
        }



    }
}
