package thread.exercise;

import java.util.Random;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:21 18-6-11
 * @Modified: null
 */
public class MyTestThread extends Thread{
    private long time;
    public MyTestThread(String name){
        super(name);
        Random ra = new Random();
        time = ra.nextInt(1000);
    }
    @Override
    public void run(){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在运行．．．");
    }

    public static void main(String[] args) {
        MyTestThread m1 = new MyTestThread("线程1");
        MyTestThread m2 = new MyTestThread("线程2");
        MyTestThread m3 = new MyTestThread("线程3");

        m1.start();
        m2.start();
        m3.start();

    }

}
