package homework.exercise3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:17 18-6-13
 * @Modified: null
 */
public class SetTest {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom();

        for(int i = 1; i < 10; i++)
            classRoom.addStu(new Student("张"+i,"S00"+i,(int)(Math.random()*100)));


        for(Student s : classRoom.getStudents())
            System.out.println(s.getName()+" " +s.getScore()+" "+s.getNumber());

    }

}

class Student{
    private String name;
    private String number;
    private int score;

    public Student(String name, String number, int score) {
        this.name = name;
        this.number = number;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getScore() {
        return score;
    }
}

class ClassRoom{
    private String name;
    private List<Student> students;

    public ClassRoom() {
        this.students = new LinkedList<Student>();
    }


    public void addStu(Student stu){
        students.add(stu);
    }

    public void removeStu(Student stu){
        int index = students.indexOf(stu);
        students.remove(index);
    }
    public double getAvergScore(){
        double totalscore = 0;
        for (Student stu :students ) {
            totalscore += stu.getScore();
        }
        return totalscore/(students.size());
    }

    public List<Student> getStudents() {
        return students;
    }
}
