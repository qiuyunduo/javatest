package homework.exercise2.Exercise5;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:54 18-6-12
 * @Modified: null
 */
public class ATM {
    public static void main(String[] args) {

        String s = "sds";
        String s1 =s;
        System.out.println(s == s1);
        Thread t = new Thread();
        Account account = new Account(200);

        Customer customer1 = new Customer("张三",account,1,100);
        Customer customer2 = new Customer("李四",account,0,50);

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        t1.start();
        t2.start();
        String String = "sds";
        System.out.println(String);

    }
}
