package testaboutclass.banking.exercise4;

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
     */
    private double balance;

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
    */
    public boolean withdraw(double money){

        if(money <= balance) {
            this.balance -= money;
            return true;
        }
        else
            return false;
    }
}
