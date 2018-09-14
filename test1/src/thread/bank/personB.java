package thread.bank;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:37 18-5-24
 * @Modified: null
 */
public class personB extends Thread {
    //创建一个银行对象
    Bank bank;

    //通过构造函数传入银行对象，保证两个人进的是同一个银行
    public personB(Bank bank){
        this.bank = bank;
    }

    //重写Run方法
    @Override
    public void run() {
        while(Bank.money >= 2000)
            bank.ATM(2000);


        try{
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
