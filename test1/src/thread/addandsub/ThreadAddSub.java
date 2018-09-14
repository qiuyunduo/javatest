package thread.addandsub;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:20 18-5-25
 * @Modified: null
 */
public class ThreadAddSub extends Thread {
    //线程的Ｉｄ
    int Id = 0;
    //判断要进行的操作
    boolean operate = true;

    //要操作的数
    static int num = 0;

    public ThreadAddSub(boolean operate,int id){
        super();
        this.operate = operate;
        this.Id = id;
    }

    @Override
    public void run(){
        super.run();
        while(true){
            if(operate){
                num += 5;
                System.out.println("线程"+Id+"执行加法运算后，num="+num);
            }else {
                num -= 4;
                System.out.println("线程"+Id+"执行减法运算后，num="+num);
            }
            try{
                sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
