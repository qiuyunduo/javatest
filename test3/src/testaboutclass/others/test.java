package testaboutclass.others;

import testaboutabstract.BasicAbstract;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:17 18-5-28
 * @Modified: null
 */
public class test {
    public static void main(String[] args) {
        Student student = new Student("0001","邱运铎",20,173,80);
        System.out.println(student.checked());
        student.enjoy("散步","学习");
        student.getScores(80,70,79,100);
        System.out.println("学号：　"+student.getNum());

        BasicAbstract.print();

        Boy boy = new Boy();
        boy.setAge(20);
        boy.setName("小明");

        Girl girl = new Girl();
        girl.setName("小红");

        boy.marry(girl);
        girl.marry(boy);

        Cylinder cylinder = new Cylinder(2,3);
        cylinder.getVolume();
    }
}
