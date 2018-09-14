package testaboutclass.banking.exercise5;

/**
 * @Author: qiuyunduo
 * @Description: 创建 SavingAccount 类，该类继承 Account 类
    c. 该类必须包含一个类型为 double 的 interestRate 属性
    d. 该类必须包括带有两个参数（balance 和 interest_rate）
    的公有构造器。该 构 造器必须通过调用 super(balance)将 balance 参数传递给父类构造 器。
 * @Date: Created in 下午5:28 18-5-28
 * @Modified: 储蓄卡账户类
 */
public class SavingAccount extends Account {
    private double interestRate;  //银行存钱利率

    /*
    该类必须包括带有两个参数（balance 和 interest_rate）
    的公有构造器。该 构 造器必须通过调用 super(balance)将 balance 参数传递给父类构造 器。
     */
    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
