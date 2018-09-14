package testaboutthread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:27 18-6-12
 * @Modified: null
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            int count=0;
            @Override
            public void run() {

                if(count < 3) {
                    System.out.println("四川地震了");
                    count++;
                }else {
                    cancel();//取消定时器
                    notifyAll();
                }

            }
        }, 1000,3000);
    }
}
