package testaboutabstract.role;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:27 18-5-30
 * @Modified: null
 */
public class Manager extends Employee {
    final String vehicle = "汽车";

    public Manager(String name, int age, String sex,double salary){
        super(name, age, sex,salary);
    }
    @Override
    public void play() {
        System.out.println("出入高档会所");
    }

    public static void main(String[] args) {
        Role role = new Employee("张三",18,"男",2000);
        role.play();
        if(role instanceof Employee) {
            Employee employee = (Employee) role;
            employee.sing();
        }
        role = new Manager("李四",20,"男",4000);

    }
}
