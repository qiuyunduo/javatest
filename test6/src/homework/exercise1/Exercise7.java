package homework.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:22 18-6-11
 * @Modified: null
 */
public class Exercise7 extends Thread {
    public Exercise7(String s){
        super(s);
    }

    @Override
    public void run(){
        System.out.println(""+getName());
        try {
            Thread.sleep((int)(Math.random()*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束！　"+getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Exercise7("Firtst");
        Thread t2 = new Exercise7("Second");
        t1.start();
        t2.start();
    }
}
