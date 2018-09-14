package homework.exercise1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:14 18-6-11
 * @Modified: null
 */
public class Exercise2 extends Thread {
    private Calendar calendar;
    private Date time;
    private SimpleDateFormat sf;
    private int year;
    private int month;
    private int day;

    public Exercise2(){

        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public void run(){
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            calendar = Calendar.getInstance();
            time = calendar.getTime();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DATE);
            String str = sf.format(time);
            System.out.println(year + "-" + (month + 1) + "-" + day + " " + str);
        }
    }

    public static void main(String[] args) {
        Exercise2 e2 = new Exercise2();

        e2.start();
    }
}
