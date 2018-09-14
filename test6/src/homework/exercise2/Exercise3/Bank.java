package homework.exercise2.Exercise3;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:04 18-6-12
 * @Modified: null
 */
public class Bank {
    private int moneys;

    public Bank(int moneys) {
        this.moneys = moneys;
    }

    public int getMoneys() {
        return moneys;
    }

    public void setMoneys(int moneys) {
        this.moneys = moneys;
    }

    public static void main(String[] args) {
        Bank bank = new Bank(0);

        Customer customer1 = new Customer("张三", bank);
        Customer customer2 = new Customer("李四", bank);

        new Thread(customer1).start();
        new Thread(customer2).start();
    }
}
