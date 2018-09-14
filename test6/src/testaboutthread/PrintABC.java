package testaboutthread;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:18 18-6-13
 * @Modified: null
 */
public class PrintABC implements Runnable{

    String pre;
    String now;

    public PrintABC(String s1, String s2){
        pre = s1;
        now = s2;
    }

    @Override
    public void run() {
        synchronized (pre){

            for (int i = 0; i < 10; i++) {
                synchronized (now) {
                    System.out.println(now);
                    now.notifyAll();
                }
                try {
                    pre.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized(now){
                now.notifyAll();
            }

        }


    }

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        new Thread(new PrintABC(c, a)).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new PrintABC(a, b)).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new PrintABC(b, c)).start();

    }
}
