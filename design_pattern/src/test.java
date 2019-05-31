/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:44 18-8-31
 * @Modified: null
 */
public class test {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                for(int i = 0; i < 100; i++)
                pong();
            }
        };

//        thread.start();//属于开启线程，进入可执行状态，等待系统分配时间片，进入线程执行run()方法
        thread.run();//属于普通方法调用
        System.out.println("ping");

    }

    public static void pong(){
        System.out.println("pong");
    }
}
