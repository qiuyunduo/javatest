package testaboutclass.banking.exercise6.report;

import testaboutclass.banking.exercise6.dao.Account;
import testaboutclass.banking.exercise6.dao.SavingAccount;
import testaboutclass.banking.exercise6.domain.Bank;
import testaboutclass.banking.exercise6.domain.Customer;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:55 18-5-29
 * @Modified: 银行账户记录报告类
 */
public class CustomerReport {
    private Customer customer;


    public void Report(Bank bank)
    {

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            customer = bank.getCustomer(i);
            System.out.println("Customer: "+customer.getLastname()+","+customer.getFirstname());
            for (Account accout:bank.getCustomer(i).getAccount()) {
                if(accout instanceof SavingAccount)
                    System.out.println("\t\tSavings Account:current balance is $"
                            +accout.getBalance());
                else
                    System.out.println("\t\tChecking Account:current balance is $"
                            +accout.getBalance());
            }

        }

    }
}
