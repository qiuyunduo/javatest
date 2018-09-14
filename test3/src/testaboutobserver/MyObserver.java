package testaboutobserver;

/**
 * @Author: qiuyunduo
 * @Description:  观察者类
 * @Date: Created in 下午7:21 18-6-2
 * @Modified: null
 */
public interface MyObserver {
    /**
     * @Author: qiuyunduo
     * @Description:
     * @Date:下午7:28 18-6-2
     * @param myObservered 被观察者对象
     * @param o　　消息类型
     * @Return: null
     */
    public void update(MyObservered myObservered, Object o);
}
