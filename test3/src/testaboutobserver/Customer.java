package testaboutobserver;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:52 18-6-2
 * @Modified: null
 */
public class Customer implements MyObserver {
    private String name;

    public Customer(String name)
    {
        this.name = name;
    }

    @Override
    public void update(MyObservered myObservered, Object o) {
        System.out.println(name+"收到消息：我降价了，快来抢购吧！！！"+o);
    }
}
