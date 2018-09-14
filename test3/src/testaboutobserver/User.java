package testaboutobserver;

import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:44 18-6-3
 * @Modified: null
 */
public class User extends MyObservered implements MyObserver {

    private String name;
    private int age;

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }

    //将观察者加入上述集合(观察了该对象)中
    public void addMyObserver(MyObserver myObserver)
    {
        if(myObserver != null) {
            observers.add(myObserver);
            notifyOneObserver(myObserver,"尊敬的： "+this.getName()+"用户，您有一个新粉丝："+((User)myObserver).getName());
        }

    }

    //将观察者从上述集合(观察了该对象)中移除
    public void delMyObserver(MyObserver myObserver)
    {
        if(myObserver != null)
            if (observers.contains(myObserver)) {
                observers.remove(myObserver);
                notifyOneObserver(myObserver,"尊敬的： "+this.getName()+"用户，您掉粉了，粉丝："+((User)myObserver).getName()+"取消了对您关注 ");
            }

    }

    @Override
    public void update(MyObservered myObservered, Object o) {
            System.out.println(o);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        User user1 = new User("小明",18);
        User user2 = new User("小红",18);
        User user3 = new User("小王",18);

        user1.addMyObserver(user3);
        user2.addMyObserver(user3);
    }
}
