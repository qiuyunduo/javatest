package testaboutclass.banking.exercise8.domain;

import testaboutclass.banking.exercise8.Dao.Account;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: qiuyunduo
 * @Description:  在banking包下的创建Customer类。该类必须实现上面的UML图表中的模 型。
    a. 声明三个私有对象属性：firstName、lastName 和 account。
    b. 声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f 和 l）
    c. 声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName
    返回相应的属性。
    d. 声明 setAccount 方法来对 account 属性赋值。
    e. 声明 getAccount 方法以获取 account 属性。
 * @Date: Created in 下午4:38 18-5-28
 * @Modified: 用户类
 */
public class Customer {
    //声明三个私有对象属性：firstName、lastName 和 account。
    private String firstname;
    private String lastname;
    //private Account account;
    private ArrayList<Account> accounts;

    //声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f 和 l）
    public Customer(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /*声明两个公有存取器来访问该对象属性，方法 getFirstName
     和 getLastName返回相应的属性。
    */
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    //声明 getAccount 方法以获取 account 属性。
    //public Account getAccount() { return account; }
    public ArrayList<Account> getAccount() {
        return accounts;
    }
    //声明 setAccount 方法来对 account 属性赋值。
    //public void setAccount(Account accout){ this.account = accout; }



    public Iterator<Account> getAccounts() { return accounts.iterator();}

    public void setAccount(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
