package homework.exercise1;

import java.util.Random;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:47 18-6-11
 * @Modified: null
 */
public class Exercise4 extends Thread {
    private int i = 0;
    public Exercise4(String name){
        super(name);
    }

    @Override
    public void run(){
        Random random = new Random();
        while(i++ < 3){
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" 第"+i+"次执行．");
        }
    }
    public static void main(String[] args) {
        Exercise4 e4 = new Exercise4("线程１");
        Exercise4 e41 = new Exercise4("线程２");
        e4.start();
        e41.start();
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
