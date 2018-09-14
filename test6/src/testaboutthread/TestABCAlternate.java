package testaboutthread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:31 18-6-12
 * @Modified: null
 */
public class TestABCAlternate {
    public static void main(String[] args) {
        AlternateDemo ad = new AlternateDemo();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    ad.loopA(i);
                }
            }
        },"A").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    ad.loopB(i);
                }
            }
        },"B").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    ad.loopC(i);
                    System.out.println("------------------------------");
                }
            }
        },"C").start();

    }
}

class AlternateDemo{
    private int number = 1; //当前正在执行线程的标号

    private Lock lock = new ReentrantLock(true);
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void loopA(int totalLoop){
        lock.lock();

        try {
            //判断当前进程的标号是否为１
            if(number != 1)
                condition1.await();

            //打印
            for (int i = 1; i <=1 ; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i+"\t"+totalLoop);
            }

            //唤醒3
            number = 2;
            condition2.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

    public void loopB(int totalLoop){
        lock.lock();

        try {
            //判断当前进程的标号是否为2
            if(number != 2)
                condition2.await();

            //打印
            for (int i = 1; i <=1 ; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i+"\t"+totalLoop);
            }

            //唤醒3
            number = 3;
            condition3.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

    public void loopC(int totalLoop){
        lock.lock();

        try {
            //判断当前进程的标号是否为１
            if(number != 3)
                condition3.await();

            //打印
            for (int i = 1; i <=1 ; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i+"\t"+totalLoop);
            }

            //唤醒1
            number = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }


    }

}