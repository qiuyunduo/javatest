package homework.exercise2;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:20 18-6-12
 * @Modified: null
 */
public class Exercise4 implements Runnable{
    private int start;
    private int end;
    private boolean flag;

    public Exercise4(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i < end; i++) {
            flag = true;
            if(i == 1)
                flag = false;
            for (int j = 2; j <= (int)Math.sqrt(i); j++)
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            if(flag)
                System.out.println(Thread.currentThread().getName()+"找到素数："+i);
        }

    }

    public static void main(String[] args) {

        new Thread(new Exercise4(1,1000),"线程一").start();
        new Thread(new Exercise4(1001,2000),"线程二").start();
        new Thread(new Exercise4(2001,3000),"线程三").start();
    }
}
