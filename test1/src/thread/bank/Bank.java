package thread.bank;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:10 18-5-24
 * @Modified: null
 */
public class Bank {
    //假设一个账户上有10000块
    static int money = 10000;

    //柜台取钱的方法
    public void Count(int money){  //参数money是每次取走的钱
        Bank.money -= money;
        System.out.println("A在柜台取走了"+money+"　还剩下"+Bank.money);
    }

    //ATM取钱的方法
    public void ATM(int money){
        Bank.money -= money;
        System.out.println("B在ATM取走了"+money+"　还剩下"+Bank.money);
    }

}
