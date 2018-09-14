package testaboutabstract.role;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:23 18-5-30
 * @Modified: null
 */
public class Employee extends Role {
    private double salary;

    public Employee(){};
    public Employee(String name, int age, String sex,double salary)
    {
        super(name,age,sex);
        this.salary = salary;
    }
    @Override
    public void play() {
        System.out.println("员工周末都会出去休息．．．");
    }

    public final void sing(){
        System.out.println("员工出去k歌．．．");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
