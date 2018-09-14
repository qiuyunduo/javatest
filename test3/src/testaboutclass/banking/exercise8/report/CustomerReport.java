package testaboutclass.banking.exercise8.report;

import testaboutclass.banking.exercise8.Dao.Account;
import testaboutclass.banking.exercise8.Dao.SavingAccount;
import testaboutclass.banking.exercise8.domain.Bank;
import testaboutclass.banking.exercise8.domain.Customer;

import java.util.Iterator;

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
        Account account;
        Iterator<Customer> cIter;
        Iterator<Account> aIter;
        System.out.println("\tCUSTOMER REPORT");
        System.out.println("=======================");
        cIter = bank.getCustomers();
        while (cIter.hasNext()){
            customer = cIter.next();
            System.out.println("Customer: "+customer.getLastname()+","+customer.getFirstname());
            aIter = customer.getAccounts();
            while (aIter.hasNext()){
                account = aIter.next();
                if(account instanceof SavingAccount)
                    System.out.println("\t\tSavings Account:current balance is $"
                            +account.getBalance());
                else
                    System.out.println("\t\tChecking Account:current balance is $"
                            +account.getBalance());
            }

        }
//        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
//            customer = bank.getCustomer(i);
//            System.out.println("Customer: "+customer.getLastname()+","+customer.getFirstname());
//            for (Account accout:bank.getCustomer(i).getAccount()) {
//                if(accout instanceof SavingAccount)
//                    System.out.println("\t\tSavings Account:current balance is $"
//                            +accout.getBalance());
//                else
//                    System.out.println("\t\tChecking Account:current balance is $"
//                            +accout.getBalance());
//            }
//
//        }

    }
}
