package homework.workaboutcollection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:48 18-6-4
 * @Modified: null
 */
public class Exercise6 {
    public static void main(String[] args) {
        Exercise6 e6 = new Exercise6();
        Set set = new HashSet();
        set.add(e6.new Worker(18,"tom",2000));
        set.add(e6.new Worker(18,"tom",2000));
        set.add(e6.new Worker(18,"jerry",2000));

        for (Object o : set) {
            System.out.println(((Worker)o).getName()+" "+((Worker)o).getAge()+" "+((Worker)o).getSalary());
        }
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
    }
}
