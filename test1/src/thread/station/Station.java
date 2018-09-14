package thread.station;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:42 18-5-24
 * @Modified: null
 */
public class Station extends Thread{
    //通过构造方法给线程名字赋值
    public Station(String name){
        super(name);  //给线程名字赋值
    }

    //为了保持票数的一致，票数要静态
    static int tick = 20;

    //创建一个静态锁
    static Object ob = '1';

    //重写run方法
    @Override
    public void run(){
        while (tick > 1){
            synchronized (ob){
                if(tick > 0){
                    System.out.println(getName() + "卖出了第" + tick + "张票");
                    tick--;
                }else {
                    System.out.println("票卖完了");
                }
            }
        }

        try{
            sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
