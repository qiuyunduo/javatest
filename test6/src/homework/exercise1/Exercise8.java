package homework.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:27 18-6-11
 * @Modified: null
 */
public class Exercise8 extends Thread {
    private int time;
    private long times;
    private long starttime;

    public Exercise8(int time){
        this.time = time;
        this.times = time;
    }

    @Override
    public void run(){
        starttime = System.currentTimeMillis();
        while(times > 0){
            long newtime = System.currentTimeMillis();
            times = 60-(newtime-starttime)/1000;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("还剩下"+times);
        }
    }

    public void start(){
        starttime = System.currentTimeMillis();
        super.start();
    }

    public static void main(String[] args) {
        Exercise8 e8 = new Exercise8(60);
        e8.start();
    }
}
