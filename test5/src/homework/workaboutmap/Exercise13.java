package homework.workaboutmap;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:27 18-6-5
 * @Modified: null
 */
public class Exercise13 {

    public static void main(String[] args) {
        Exercise13 e13 = new Exercise13();
        List list = new ArrayList();
        list.add(e13.new Account(10.00,"1234"));
        list.add(e13.new Account(15.00,"5678"));
        list.add(e13.new Account(0d,"1010"));

        HashMap<Long,Account> hashMap = new HashMap();

        for (Object o : list ) {
            Account account = (Account)o;
            hashMap.put(account.getId(),account);
        }

        Set<Map.Entry<Long,Account>> set = hashMap.entrySet();

        for (Map.Entry<Long,Account> entry: set ) {
            System.out.println("id="+entry.getValue().getId()+", balance="+entry.getValue().getBalance());
        }


    }

    public static long i = 1000;

    public class Account{
        private long id;
        private Double balance;
        private String password;

        public Account(Double balance, String password) {
            this.id = i++;
            this.balance = balance;
            this.password = password;
        }

        public long getId() {
            return id;
        }

        public Double getBalance() {
            return balance;
        }

        public String getPassword() {
            return password;
        }
    }
}
