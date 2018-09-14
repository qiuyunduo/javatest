package testaboutclass.banking.exercise4;

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

    private testaboutclass.banking.exercise4.Customer[] customers;
    private int numberOfCustomers;

    //添加公有构造器，以合适的最大尺寸（至少大于 5）初始化 customers 数组。

    public Bank(){
        this.customers = new testaboutclass.banking.exercise4.Customer[10];
    }


    /*
    添加 addCustomer 方法。该方法必须依照参数（ 姓，名） 构造一个新的
    Customer对象然后把它放到 customer 数组中。还必须把 numberofCustomers
    属性的值加 1。
     */
    public void addCustomer(String f, String l){
        testaboutclass.banking.exercise4.Customer customer = new testaboutclass.banking.exercise4.Customer(f,l);
        customers[numberOfCustomers++] = customer;

    }


    //添加 getCustomer方法。它返回与给出的index参数相关的客户。
    public testaboutclass.banking.exercise4.Customer getCustomer(int index) {
        return customers[index];
    }
    //添加 getNumOfCustomers 访问方法，它返回 numberofCustomers 属 性值。
    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }
}
