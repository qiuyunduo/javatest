package testaboutclass.banking.exercise7.dao;

import testaboutclass.banking.exercise7.domain.OverdraftException;

/**
 * @Author: qiuyunduo
 * @Description: 在 banking 包下创建 Account 类。该类必须实现上述 UML 框图中的模型。
 * a. 声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或 即
    时）余额。
    b. 声 明 一 个 带 有 一 个 参 数 （ init_balance ） 的 公 有 构 造 器 ， 这 个 参 数 为
    balance 属性赋值。
    c . 声明一个公有方法 geBalance，该方法用于获取经常余额。
    d. 声明一个公有方法 deposit,该方法向当前余额增加金额。
    e. 声明一个公有方法 withdraw 从当前余额中减去金额。
 * @Date: Created in 下午4:19 18-5-28
 * @Modified: 账户类
 */
public class Account {
    /*声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或 即时）余额。
       第一次修改：将 balance 属性的访问方式改为 protected b.
     */
    protected double balance;

    /*声 明 一 个 带 有 一 个 参 数 （ init_balance ） 的 公 有 构 造 器 ，
    这 个 参 数 为balance 属性赋值。
     */
    public Account(double balance){
        this.balance = balance;
    }

    //. 声明一个公有方法 geBalance，该方法用于获取经常余额。
    public double getBalance()
    {
        return this.balance;
    }

    /*
     1, 声明一个公有方法 deposit,该方法向当前余额增加金额。
     第一次修改： 修改 deposit 方法返回 true（意味所有存款是成功的）。
    */
    public boolean deposit(double money){
        this.balance += money;
        return true;
    }

     /*
     1, 声明一个公有方法 withdraw 从当前余额中减去金额。
     第一次修改： 修改 withdraw 方法来检查提款数目是否大于余额。
     如果amt 小于 balance, 则从余额中扣除提款数目并返回 true ，
     否则余额不变返回 false
     第二次修改：重写 withdraw 方法使它不返回值（即 void）.声明方法抛出overdraftException异常
                修改代码抛出新异常，指明“资金不足”以及不足数额（当前余额扣除请求 的数额）
    */
    public void withdraw(double money) throws OverdraftException {

        if(money <= balance)
            this.balance -= money;
        else
            throw new OverdraftException("余额不足，不足数额：　",money-balance);
    }
}
