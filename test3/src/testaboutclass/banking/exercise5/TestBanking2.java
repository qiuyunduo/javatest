package testaboutclass.banking.exercise5;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:53 18-5-28
 * @Modified:  测试０５
 */
public class TestBanking2 {
    public static void main(String[] args) {
        String laststr = "";

        testaboutclass.banking.exercise5.Bank bank = new testaboutclass.banking.exercise5.Bank();
        testaboutclass.banking.exercise5.SavingAccount sA = new testaboutclass.banking.exercise5.SavingAccount(500,0.03);
        bank.addCustomer("Jane","Smith",sA);
        System.out.println("Creating the customer Jane Smith.");
        System.out.println("Creating her Savings Account with a "+sA.getBalance()
                +" balance and "+(int)(sA.getInterestRate()*100)+"% interest");
        System.out.println();

        testaboutclass.banking.exercise5.CheckingAccount cA = new testaboutclass.banking.exercise5.CheckingAccount(500);
        bank.addCustomer("Owen","Bryant",cA);
        System.out.println("Creating the customer Owen Bryant.");
        System.out.println("Creating his Checkings Account with a "+cA.getBalance()
                +" balance and no overdraft protection");
        System.out.println();

        testaboutclass.banking.exercise5.CheckingAccount cA1 = new testaboutclass.banking.exercise5.CheckingAccount(500,500);
        bank.addCustomer("Tim","Soley",cA1);
        System.out.println("Creating the customer Tim Soley.");
        System.out.println("Creating his Checkings Account with a "+cA.getBalance()
                +" balance and "+cA1.getOverdraftProtestion()+" in overdraft protection");
        System.out.println();

        bank.addCustomer("Maria","Soley",cA1);
        System.out.println("Creating the customer Maria Soley.");
        System.out.println("Maria shares her Checking Account with her husband Tim");
        System.out.println();

        for (int i = 0; i < bank.getNumberOfCustomers()-1; i++) {
            if(bank.getCustomer(i).getAccount() instanceof testaboutclass.banking.exercise5.CheckingAccount) {
                laststr = "with his Checking Account";
                if(((testaboutclass.banking.exercise5.CheckingAccount) bank.getCustomer(i).getAccount()).getOverdraftProtestion() == 0)
                    laststr = "with his Checking Account with no overdraft protestion";
                else
                    laststr = "with his Checking Account with that has overdraft protestion";
            }else if(bank.getCustomer(i).getAccount() instanceof testaboutclass.banking.exercise5.SavingAccount)
                laststr = "with her savings Account";

            System.out.println("Retrieving the customer "+bank.getCustomer(i).getFirstname()+" "
                    +bank.getCustomer(i).getLastname()+" "+laststr);

            System.out.println("Withdraw 150.00: "+bank.getCustomer(i).getAccount().withdraw(150));
            System.out.println("Deposit 22.50: "+bank.getCustomer(i).getAccount().deposit(22.5));
            System.out.println("Withdraw 47.62: "+bank.getCustomer(i).getAccount().withdraw(47.62));
            System.out.println("Withdraw 400.00: "+bank.getCustomer(i).getAccount().withdraw(400));

            System.out.println("Customer ["
                    +bank.getCustomer(i).getFirstname()+" "
                    +bank.getCustomer(i).getLastname()
                    +"] has a balance of "
                    +bank.getCustomer(i).getAccount().getBalance());
            System.out.println();
            }
        System.out.println("Retrieving the customer "
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getFirstname()+" "
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getLastname()
                +" with her joint checking account with husband Tim. ");

        System.out.println("Deposit 150.00: "
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getAccount().deposit(150));
        System.out.println("Withdraw 750.00: "
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getAccount().withdraw(750));

        System.out.println("Customer ["
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getFirstname()+" "
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getLastname()
                +"] has a balance of "
                +bank.getCustomer(bank.getNumberOfCustomers()-1).getAccount().getBalance());
//
        }
}
