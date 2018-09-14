package homework.workaboutcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:07 18-6-4
 * @Modified: null
 */
public class Exercise5 {
    public static void main(String[] args) {
        Exercise5 e5 = new Exercise5();
        List list = new ArrayList();

        list.add(e5.new Worker(18,"zhang3",3000));
        list.add(e5.new Worker(25,"li4",3500));
        list.add(e5.new Worker(22,"wang5",3200));

        list.add(1,e5.new Worker(24,"zhao6",3300));

        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            Worker worker = (Worker)list.get(i);
            System.out.println(worker.getName()+" "+worker.getAge()+" "+worker.getSalary());
        }
        //调用Worker的工作方法
        Iterator iterable = list.iterator();

        while(iterable.hasNext())
            ((Worker)(iterable.next())).Worker();

        Worker w1 = e5.new Worker(18,"z2",3000);
        Worker w2 = e5.new Worker(18,"z2",3000);

        System.out.println(w1.equals(w2));


    }
    public class Worker {

        private int age;
        private String name;
        private double salary;

        public Worker() {

        }

        public Worker(int age, String name, double salary) {
            this.age = age;
            this.name = name;
            this.salary = salary;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void Worker() {
            System.out.println(name + " working");
        }


        public boolean equals(Worker worker) {
            return age == worker.age &&
                    Double.compare(worker.salary, salary) == 0 &&
                    Objects.equals(name, worker.name);
        }

    }
}
