package homework.Login.Empoyee;

import homework.Login.exception.AgeBigException;
import homework.Login.exception.AgeLittleException;
import homework.Login.exception.NullException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:57 18-5-31
 * @Modified: null
 */
public class Employee {
    private String num;
    private String name;
    private int age;
    private double salary;
    private String identitfynum;
    private int counts;
    private double allsalarys;

    public Employee(String num, String name, int age) throws Exception{
        this.num = num;
        if(name == null || name.equals(""))
            throw new NullException("姓名为null或者空字符串");
        else
            this.name = name;

        if(age < 18)
            throw new AgeLittleException("年龄过低");
        else if(age > 60)
            throw new AgeBigException("年龄过高");
        else
            this.age = age;
    }

    public static void main(String[] args) throws Exception{
            try {
                Employee e = new Employee("1111", "12", 12);
            } catch (NullException e1) {
                e1.PrintExpection();
            } catch (AgeBigException e2) {
                e2.PrintExpection();
            } catch (AgeLittleException e3) {
                e3.PrintExpection();
            }finally {
                System.out.println("");
            }
    }
}
