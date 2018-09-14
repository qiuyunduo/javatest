package homework.exercise2.Exercise3;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:50 18-6-12
 * @Modified: null
 */
public class Customer implements Runnable{
    private String name;
    private Bank bank;

    public Customer(String name,Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public void remit(int money){
        bank.setMoneys(bank.getMoneys() + money);
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            remit(100);
            System.out.println(name+"向银行汇款："+100+" 此时银行的汇款总额为:"+bank.getMoneys());
        }
    }
}
