package obseverTest;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:50 18-8-14
 * @Modified: null
 */
public class User1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String product = (String)arg;
        Product product1 = (Product)o;
        System.out.println("user1接到新产品"+product+"发布的推送消息");
        product1.sayHello();
    }
}
