package thread.consumes;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:05 18-5-25
 * @Modified: null
 */
public class ProcessStart {
    public static void main(String[] args) {
        KFC kfc = new KFC();

        Customer customer1 = new Customer(kfc);
        Customer customer2 = new Customer(kfc);
        Customer customer3 = new Customer(kfc);

        Waiter waiter1 = new Waiter(kfc);
        Waiter waiter2 = new Waiter(kfc);
        Waiter waiter3 = new Waiter(kfc);
        Waiter waiter4 = new Waiter(kfc);

        customer1.start();
        customer2.start();
        customer3.start();
        waiter1.start();
        waiter2.start();
        waiter3.start();
        waiter4.start();
    }
}
