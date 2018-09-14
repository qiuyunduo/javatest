package homework.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:17 18-6-11
 * @Modified: null
 */
public class Exercise6 implements Runnable {
    @Override
    public void run() {
        System.out.println("running");
    }

    void go(){
        start(1);
    }

    void start(int i){

    }

    public static void main(String[] args) {
        Exercise6 e6 = new Exercise6();
        Thread thread = new Thread(e6);
        thread.start();
    }
}
