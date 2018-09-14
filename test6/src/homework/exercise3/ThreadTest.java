package homework.exercise3;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:17 18-6-13
 * @Modified: null
 */
public class ThreadTest implements Runnable{
    private static int num = 100;
    private boolean add = false;
    private boolean sub = false;

    public ThreadTest(boolean add, boolean sub) {
        this.add = add;
        this.sub = sub;
    }

    @Override
    public void run() {
        if(add) {
            num++;
            System.out.println(Thread.currentThread().getName()+" 在进行加１操作　num="+num);
        }
        if(sub) {
            num--;
            System.out.println(Thread.currentThread().getName()+" 在进行减１操作　num="+num);
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadTest(true,false),"线程１").start();
        new Thread(new ThreadTest(false,true),"线程2").start();
        new Thread(new ThreadTest(true,false),"线程3").start();
        new Thread(new ThreadTest(false,true),"线程4").start();

    }
}

