package homework.exercise1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:56 18-6-11
 * @Modified: null
 */
public class Exercise9{
    public static void main(String[] args) {
        BookingClerk bt = new BookingClerk();
        new BookingTest(bt,7);
        new BookingTest(bt,5);
//        int[] s = {1,2,3,4,5};
//        int a = 2;
//        s[a++] = 100;
//        System.out.println(s[1]+" "+s[2]+" "+s[3]);
    }
}

class BookingClerk{
    Lock lock = new ReentrantLock();
    int remainder = 10;


    void booking (int num) {
        lock.lock();
            if (num <= remainder) {
                System.out.println("预定" + num + "张");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                remainder -= num;


            } else {
                System.out.println("剩余票不足，无法预定");
            }

            System.out.println("还剩下" + remainder + "票");

        lock.unlock();
        }


}

class BookingTest implements Runnable{
    BookingClerk bt;
    int num;


    BookingTest(BookingClerk bt,int num){
        this.bt = bt;
        this.num = num;
        new Thread(this).start();
    }
    @Override
    public void run() {
        bt.booking(num);
    }
}
