package homework.exercise2.Exercise5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:50 18-6-12
 * @Modified: null
 */
public class Customer implements Runnable{
    private String name;
    private Account account;
    private int flag;
    private double money;
    private static ReadWriteLock lock = new ReentrantReadWriteLock();


    public Customer(String name, Account account,int flag,double money) {
        this.name = name;
        this.account = account;
        this.flag = flag;
        this.money = money;
    }

    @Override
    public void run() {
        System.out.println(name+"正在进行存款操作");
        System.out.println(name+"正在获取账户余额");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double balance = account.getBalance();
        System.out.println(name+"获取成功，余额为："+balance);

        if(flag == 0){
            try {
                account.draw(money);
                System.out.println(name+"成功取出"+money);
            } catch (MyException e) {
                e.print();
            }
        }
        else if(flag == 1){
            account.deposit(money);
            System.out.println(name+"成功存入"+money);
        }


        System.out.println(name+"将新的账户信息回传到服务器");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+",操作结束，服务器刷新成功，此时账户余额为："+account.getBalance());
    }
}
