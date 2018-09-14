package testaboutobserver;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:32 18-6-2
 * @Modified: null
 */
public class TestObserver {
    public static void main(String[] args) {
        Product pro = new Product("牛仔裤");

        Customer c1 = new Customer("张三");
        Customer c2 = new Customer("李四");
        Customer c3 = new Customer("王五");

        pro.addMyObserver(c1);
        pro.addMyObserver(c2);
        pro.addMyObserver(c3);

        pro.setPrice(98.8);


    }
}
