package homework.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:36 18-6-11
 * @Modified: null
 */
public class Exercise3 extends Thread {
    private String name;
    private int time;

    public Exercise3(String name,int time)
    {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"休眠了"+time+"ms,现正在运行．．．");
    }

    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3("线程1",1000);
        Exercise3 e31 = new Exercise3("线程2",500);
        Exercise3 e32= new Exercise3("线程3",1500);
        Exercise3 e33 = new Exercise3("线程4",600);
        Exercise3 e34= new Exercise3("线程5",100);


        e3.start();
        e31.start();
        e32.start();
        e33.start();
        e34.start();
    }
}
