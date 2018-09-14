package testaboutclass.banking.exercise7;

import testaboutclass.banking.exercise7.dao.Account;
import testaboutclass.banking.exercise7.dao.CheckingAccount;
import testaboutclass.banking.exercise7.domain.Bank;
import testaboutclass.banking.exercise7.domain.Customer;
import testaboutclass.banking.exercise7.domain.OverdraftException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午8:47 18-5-31
 * @Modified: 测试０7
 */
public class TestBanking4 {
    public static void main(String[] args) {
        Bank bank = Bank.getBanking();
        Customer customer = null;
        String laststr = "";

        CheckingAccount cA1 = new CheckingAccount(200,500);
        bank.addCustomer("Jane", "Smith", cA1);

        CheckingAccount cA2 = new CheckingAccount(200);
        bank.addCustomer("Owen", "Bryant", cA2);
        //第一位用户
        customer = bank.getCustomer(0);
        for (Account a:customer.getAccount()) {
            if(a instanceof CheckingAccount){
                laststr += "has a checking balance of "+a.getBalance()+" ";
                if(((CheckingAccount) a).getOverdraftProtestion() != 0)
                    laststr += "with a "+((CheckingAccount) a).getOverdraftProtestion()
                            +" overdraft protection";
                System.out.println("Customer ["+customer.getLastname()+","+customer.getFirstname()+"]"+laststr);
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: withdraw 150.00");
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: deposit 22.50");
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: withdraw 147.62");
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: withdraw 470.00");
                try {
                    a.withdraw(150);
                    a.deposit(22.50);
                    a.withdraw(147.62);
                    a.withdraw(470);
                } catch (OverdraftException e) {
                    e.pintException();
                }
                System.out.println("Customer ["+customer.getLastname()+","+customer.getFirstname()
                        +"]has a checking balance of "+a.getBalance());
            }
            laststr = "";
        }
        //第二位用户
        System.out.println();
        customer = bank.getCustomer(1);
        for (Account a:customer.getAccount()) {
            if(a instanceof CheckingAccount){
                laststr += "has a checking balance of "+a.getBalance()+" ";
                if(((CheckingAccount) a).getOverdraftProtestion() != 0)
                    laststr += "with a "+((CheckingAccount) a).getOverdraftProtestion()
                            +" overdraft protection";
                System.out.println("Customer ["+customer.getLastname()+","+customer.getFirstname()+"]"+laststr);
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: withdraw 100.00");
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: deposit 25.00");
                System.out.println("Checking Acct["+customer.getLastname()+","+customer.getFirstname()+"]: withdraw 175.00");
                try {
                    a.withdraw(100);
                    a.deposit(25.00);
                    a.withdraw(175.00);
                } catch (OverdraftException e) {
                    e.pintException();
                }
                System.out.println("Customer ["+customer.getLastname()+","+customer.getFirstname()
                        +"]has a checking balance of "+a.getBalance());
            }
            laststr = "";
        }


    }
}
