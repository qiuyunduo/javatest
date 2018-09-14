package thread.bank;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:40 18-5-24
 * @Modified: null
 */
public class BankLogin {
    public static void main(String[] args){
        Bank bank = new Bank();

        personA personA = new personA(bank);
        personB personB = new personB(bank);

        personA.start();
        personB.start();

    }
}
