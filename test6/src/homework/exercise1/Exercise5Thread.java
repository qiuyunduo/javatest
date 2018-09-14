package homework.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:15 18-6-11
 * @Modified: null
 */
public class Exercise5Thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("new");
        }
    }

    public static void main(String[] args) {
        Exercise5Thread thread1 = new Exercise5Thread();
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main");
        }

    }
}
