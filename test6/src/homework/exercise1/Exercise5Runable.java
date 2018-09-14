package homework.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:05 18-6-11
 * @Modified: null
 */
public class Exercise5Runable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("new");
        }
    }

    public static void main(String[] args) {
        Exercise5Runable exercise5Runable = new Exercise5Runable();
        Thread thread1 = new Thread(exercise5Runable);
        thread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main");
        }

    }
}
