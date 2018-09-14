package homework.workaboutcollection;

import java.util.Objects;
import java.util.TreeSet;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午10:35 18-6-4
 * @Modified: null
 */
public class Exercise7 {
    public static void main(String[] args) {
        Exercise7 e7 = new Exercise7();
        TreeSet set3=new TreeSet();
        set3.add(e7.new Worker( 18,"zhang3",1500));
        set3.add(e7.new Worker( 18,"li4",1500));
        set3.add(e7.new Worker( 18,"wang5",1600));
        set3.add(e7.new Worker( 17,"zhao6",2000));
        //集合中元素的类型 临时变量：集合对象
        for (Object object : set3) {
            Worker worker = (Worker)object;
            System.out.print(worker.getName()+"  ");
        }
        System.out.println();
    }
    public class Worker implements Comparable{

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Worker worker = (Worker) o;
            return age == worker.age &&
                    Double.compare(worker.salary, salary) == 0 &&
                    Objects.equals(name, worker.name);
        }

        @Override
        public int hashCode() {

            return Objects.hash(age, name, salary);
        }

        @Override
        public int compareTo(Object o) {
            Worker worker = (Worker)o;
            if(this.age > worker.getAge())
                return 1;
            else if(this.age == worker.getAge() && this.salary > worker.getSalary())
                return 1;
            else if(this.age == worker.getAge() && this.salary == worker.getSalary())
                return this.name.compareTo(worker.getName());
            else if(this.equals(worker))
                return 0;
            else
                return -1;

        }
    }
}
