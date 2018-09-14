package homework.exercise1;

import java.util.Random;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:09 18-6-11
 * @Modified: null
 */
public class Exercise1 extends Thread{

    private long time;

    public Exercise1(String name){
        super(name);
        Random ra = new Random();
        time = ra.nextInt(10000);
    }
    @Override
    public void run(){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"正在运行．．．，休眠时间："+time);
    }

    public static void main(String[] args) {
        Exercise1 m1 = new Exercise1("线程1");
        Exercise1 m2 = new Exercise1("线程2");
        Exercise1 m3 = new Exercise1("线程3");

        m1.start();
        m2.start();
        m3.start();

    }

}
