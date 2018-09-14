package homework.exercise2.Exercise5;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:47 18-6-12
 * @Modified: null
 */
public class Account {
    private double balance;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        lock.readLock().lock();
        try {
            return balance;
        }
        finally {
            lock.readLock().unlock();
        }

    }

    public void setBalance(double balance) {
        lock.writeLock().lock();
        try {
            this.balance = balance;
        }finally {
            lock.writeLock().unlock();
        }

    }

    //取款
    public void draw(double money) throws MyException {
        if(balance > money){
            setBalance(balance-money);
        }
        else
            throw new MyException();
    }

    //存款
    public void deposit(double money){
        setBalance(balance+money);
    }
}
