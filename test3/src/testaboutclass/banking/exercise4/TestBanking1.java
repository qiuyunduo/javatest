package testaboutclass.banking.exercise4;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:16 18-5-28
 * @Modified: 测试０４
 */
public class TestBanking1 {
    public static void main(String[] args) {
        testaboutclass.banking.exercise4.Bank bank = new testaboutclass.banking.exercise4.Bank();
        bank.addCustomer("Simms","Jane");
        bank.addCustomer("Bryant","Owen");
        bank.addCustomer("Soley","Tim");
        bank.addCustomer("Soley","Maria");
        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println("Customer["+(i+1)+"] is "+bank.getCustomer(i).getFirstname()
                    +", "+bank.getCustomer(i).getLastname());
        }

    }
}
