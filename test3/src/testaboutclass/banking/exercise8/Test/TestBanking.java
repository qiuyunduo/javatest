package testaboutclass.banking.exercise8.Test;

import testaboutclass.banking.exercise8.Dao.CheckingAccount;
import testaboutclass.banking.exercise8.Dao.SavingAccount;
import testaboutclass.banking.exercise8.domain.Bank;
import testaboutclass.banking.exercise8.report.CustomerReport;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:49 18-5-29
 * @Modified: 测试０6 , 08
 */
public class TestBanking {
    public static void main(String[] args) {
        Bank bank = Bank.getBanking();
        CustomerReport cr = new CustomerReport();

        SavingAccount sA1 = new SavingAccount(500,0.03);
        CheckingAccount cA1 = new CheckingAccount(200);
        bank.addCustomer("Jane","Smith",sA1,cA1);

        CheckingAccount cA2 = new CheckingAccount(200);
        bank.addCustomer("Owen","Bryant",cA2);

        SavingAccount sA2 = new SavingAccount(1500,0.03);
        CheckingAccount cA3 = new CheckingAccount(200,500);
        bank.addCustomer("Tim","Soley",sA2,cA3);

        CheckingAccount cA4 = new CheckingAccount(200,500);
        SavingAccount sA3 = new SavingAccount(150,0.03);
        bank.addCustomer("Maria","Soley",cA4,sA3);

        cr.Report(bank);

    }
}
