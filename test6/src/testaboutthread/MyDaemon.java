package testaboutthread;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:43 18-6-14
 * @Modified: null
 */
public class MyDaemon extends Thread{
    public MyDaemon(String naem) {
        super(naem);
        setDaemon(true);
        start();
    }

    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName()+"正在运行．．");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyDaemon myDaemon = new MyDaemon("我被设为守护进程");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+"正在运行．．．");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"普通线程").start();

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName()+"正在运行．．．");
//            }
//        },"我是一个普通线程");
//
//        t1.setDaemon(true);
//        t1.setName("我变成了守护线程");
//        t1.start();


    }
}
