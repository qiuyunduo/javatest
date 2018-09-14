package testaboutlock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:47 18-6-12
 * @Modified: null
 */
public class TestReadWriteLock {
    public static void main(String[] args) {

        ReadWriterDemo rwd = new ReadWriterDemo();

        //该线程完成写入操作
        new Thread(new Runnable() {
            @Override
            public void run() {
                rwd.set((int)(Math.random()*101));
            }
        },"write").start();
        //该线程完成读取
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    rwd.get();
                }
            }
        },"read").start();
    }

}

class ReadWriterDemo{
    private int num = 0;
    ReadWriteLock lock = new ReentrantReadWriteLock();

    public int get(){
        //上锁
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+
                    "读取数字"+num);
        }finally {
            lock.readLock().unlock();//释放锁
        }
        return num;
    }

    public void set(int num){
        //加锁lock.writeLock():得到写锁
        lock.writeLock().lock();

        try {
            System.out.println(Thread.currentThread().getName()+"开始写锁了");
            this.num = num;
        }finally {
            lock.writeLock().unlock();
        }
    }
}
