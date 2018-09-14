package testaboutclass.banking.exercise7.domain;

import testaboutclass.banking.exercise7.dao.Account;
import testaboutclass.banking.exercise8.report.CustomerReport;

import java.util.ArrayList;

/**
 * @Author: qiuyunduo
 * @Description: 创建 Bank类
    b. 为 Bank 类 增 加 两 个 属 性 ： customers(Customer对象的数组 ) 和
    numberOfCustomers(整数，跟踪下一个 customers 数组索引)
    c. 添加公有构造器，以合适的最大尺寸（至少大于 5）初始化 customers 数组。
    d. 添加 addCustomer 方法。该方法必须依照参数（ 姓，名） 构造一个新的
    Customer对象然后把它放到 customer 数组中。还必须把 numberofCustomers
    属性的值加 1。
    e. 添加 getNumOfCustomers 访问方法，它返回 numberofCustomers 属 性值。
    f.  添加 getCustomer方法。它返回与给出的index参数相关的客户。
 * @Date: Created in 下午5:04 18-5-28
 * @Modified: 银行类
 */
public class Bank {
    /*
    为 Bank 类 增 加 两 个 属 性 ： customers(Customer对象的数组 ) 和
    numberOfCustomers(整数，跟踪下一个 customers 数组索引)
     */
    private static Bank bank;
    private CustomerReport[] cRs;

    private Customer[] customers;
    private int numberOfCustomers;

    /* 添加公有构造器，以合适的最大尺寸（至少大于 5）初始化 customers 数组。
     第一次修改： 单个的实例应是静态属性，且为私有。同样，Bank 构造器也应该是私有的
    */
    private Bank(){
        this.cRs = new CustomerReport[10];
        this.customers = new Customer[10];
    }

    /*
    1． 修改 Bank 类，创建名为 getBanking 的公有静态方法，它返回一个 Bank
    类的实例。
     */
    public static Bank getBanking(){
        if(bank == null)
            bank = new Bank();
        return bank;
    }
    /*
    添加 addCustomer 方法。该方法必须依照参数（ 姓，名） 构造一个新的
    Customer对象然后把它放到 customer 数组中。还必须把 numberofCustomers
    属性的值加 1。
     */
    public void addCustomer(String f, String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomers++] = customer;

    }
    /*
  重载addCustomer 方法。该方法必须依照参数（ 姓，名,账户） 构造一个新的
  Customer对象然后把它放到 customer 数组中。还必须把 numberofCustomers
  属性的值加 1。
   */

    public void addCustomer(String f, String l,Account... accounts){
        ArrayList<Account> accounts1 = new ArrayList<Account>();
        for (Account accout:accounts) {
            accounts1.add(accout);
        }

        Customer customer = new Customer(f,l);
        customer.setAccount(accounts1);

        customers[numberOfCustomers++] = customer;
    }

    //添加 getCustomer方法。它返回与给出的index参数相关的客户。
    public Customer getCustomer(int index) {
        return customers[index];
    }
    //添加 getNumOfCustomers 访问方法，它返回 numberofCustomers 属 性值。

    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }
}
