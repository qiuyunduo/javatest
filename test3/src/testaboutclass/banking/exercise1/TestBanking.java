package testaboutclass.banking.exercise1;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:29 18-5-28
 * @Modified: 测试０１～０３
 */
public class TestBanking {
    public static void main(String[] args) {
        Account account = new Account(500);
        System.out.println("Creating an account with a "
                +account.getBalance()+" balance");
        System.out.println("Withdraw 150.00 ");
        account.withdraw(150);
        System.out.println("Deposit 22.50 ");
        account.deposit(22.5);
        System.out.println("Withdraw 47.62 ");
        account.withdraw(47.62);
        System.out.println("The account has a balance of "+account.getBalance());
    }
}
