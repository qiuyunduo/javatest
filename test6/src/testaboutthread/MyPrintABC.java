package testaboutthread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:05 18-6-13
 * @Modified: null
 */
public class MyPrintABC  implements Runnable{
    private String preStr;
    private String nowStr;

    public MyPrintABC(String pre, String now) {
        this.preStr = pre;
        this.nowStr = now;
    }



    @Override
    public void run() {
        synchronized (preStr){
            for(int j = 0; j < 10; j++) {
                synchronized (nowStr) {
                    System.out.println(nowStr);
                    nowStr.notifyAll();
                    System.out.println("释放阻塞在"+nowStr+"阻塞队列中的线程");
                }
                try {
                    System.out.println("将输出"+nowStr+"的线程加入到"+preStr+"的阻塞队列中");
                    preStr.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (nowStr){
                System.out.println("释放阻塞在"+nowStr+"阻塞队列中的线程");
                nowStr.notifyAll();
            }

        }

    }

    public static void main(String[] args) {
        new Thread(new MyPrintABC("C","A")).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new MyPrintABC("A","B")).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new MyPrintABC("B","C")).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

