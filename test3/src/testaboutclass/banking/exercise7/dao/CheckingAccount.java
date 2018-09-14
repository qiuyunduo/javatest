package testaboutclass.banking.exercise7.dao;

import testaboutclass.banking.exercise7.domain.OverdraftException;

/**
 * @Author: qiuyunduo
 * @Description:  该类必须包含一个类型为 double 的 overdraftProtection 属性。
    3． 该类必须包含一个带有参数（balance）的共有构造器。该构造器必须通过调
    用 super(balance)将 balance 参数传递给父类构造器。
    4． 给类必须包括另一个带有两个参数（balance 和 protect）的公有构造器。
    该 构造器必须通过调用 super(balance)并设置 overdragtProtection 属性，
    将 balance 参数传递给父类构造器。
    5． CheckingAccount 类必须覆盖 withdraw 方法。此方法必须执行下列检 查。
    如 果当前余额足够弥补取款 amount,则正常进行。如果不够弥补但是 存在透支 保护，
    则尝试用 overdraftProtection 得值来弥补该差值（balance-amount）.
    如果弥补该透支所需要的金额大于当前的保护级别。 则整个交易失败，但余 额未受影响。
 * @Date: Created in 下午5:29 18-5-28
 * @Modified: 信用卡账户类
 */
public class CheckingAccount extends Account {
    // 该类必须包含一个类型为 double 的 overdraftProtection 属性。透支额度
    private double overdraftProtestion;

    /*
    该类必须包含一个带有参数（balance）的共有构造器。该构造器必须通过调
    用 super(balance)将 balance 参数传递给父类构造器。
     */
    public CheckingAccount(double balance) {
        super(balance);
    }

    /*
    给类必须包括另一个带有两个参数（balance 和 protect）的公有构造器。
    该 构造器必须通过调用 super(balance)并设置 overdragtProtection 属性，
    将 balance 参数传递给父类构造器。
     */
    public CheckingAccount(double balance,double overdraftProtestion) {
        super(balance);
        this.overdraftProtestion = overdraftProtestion;
    }

    /*
     CheckingAccount 类必须覆盖 withdraw 方法。此方法必须执行下列检 查。
    如 果当前余额足够弥补取款 amount,则正常进行。如果不够弥补但是 存在透支 保护，
    则尝试用 overdraftProtection 得值来弥补该差值（balance-amount）.
    如果弥补该透支所需要的金额大于当前的保护级别。 则整个交易失败，但余 额未受影响。
    第一次修改：
     */
    public void withdraw(double money) throws OverdraftException {
//        System.out.println("sdssd");
        if(overdraftProtestion == 0) {
            if(money <= balance)
                this.balance -= money;
            else {
                throw new OverdraftException("no overdraft protection ",money-balance);
            }
        }
        else
            if(money <= balance + overdraftProtestion){
                if(money <= balance)
                    this.balance -= money;
                else {
                    overdraftProtestion -= money-balance;
                    balance = 0;
                }
            }
            else
                throw new OverdraftException("Insufficient funds for overdraft protection ",money);
    }

    public double getOverdraftProtestion() {
        return overdraftProtestion;
    }
}
