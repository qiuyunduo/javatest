package thread.consumes;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:05 18-5-25
 * @Modified: null
 */
public class Waiter extends Thread {
    KFC kfc;

    public Waiter(KFC kfc){
        this.kfc = kfc;
    }

    @Override
    public void run(){
        int nums = (int)Math.random()*5+5;
        while (true){
            this.kfc.productfoods(nums);
        }
    }
}
