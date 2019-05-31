package obseverTest;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:55 18-8-14
 * @Modified: null
 */
public class test {
    public static void main(String[] args) {
        Product product = Product.getInstance();
        User1 user1 = new User1();
        User2 user2 = new User2();
        User3 user3 = new User3();

        product.addProductObserver(user1);
        product.addProductObserver(user2);
        product.addProductObserver(user3);

        product.addProduct("华为荣耀 10plus");
    }
}
