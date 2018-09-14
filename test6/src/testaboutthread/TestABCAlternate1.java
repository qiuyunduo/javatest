package testaboutthread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:44 18-6-13
 * @Modified: null
 */
public class TestABCAlternate1 {
    public static void main(String[] args) {
        AlternateDemo1 a1 = new AlternateDemo1();
        new Thread(a1).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(a1).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(a1).start();

        }
}

class AlternateDemo1 implements Runnable{
    private String str;
    private Lock lock = new ReentrantLock(true);
    private Condition condition = lock.newCondition();
    private int num = 1;

    public void PrintStr(){
        if(num == 1)
            Thread.currentThread().setName("B");
        else if(num == 2)
            Thread.currentThread().setName("C");
        else
            Thread.currentThread().setName("A");
        lock.lock();
        try{
            if(num < 3)
            {
                num++;
                condition.await();
            }
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            condition.signal();
            condition.await();

        }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }finally {
            condition.signalAll();
            lock.unlock();
        }
    }

    @Override
    public void run() {
        PrintStr();

    }
}
