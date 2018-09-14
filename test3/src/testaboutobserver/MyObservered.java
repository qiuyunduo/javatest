package testaboutobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:21 18-6-2
 * @Modified: null
 */
public class MyObservered {
    //观察者的对象集合(观察了该对象)
    protected List<MyObserver> observers;

    public MyObservered(){
        observers = new ArrayList<MyObserver>();
    };

    //将观察者加入上述集合(观察了该对象)中
    public void addMyObserver(MyObserver myObserver)
    {
        if(myObserver != null)
            observers.add(myObserver);

    }

    //将观察者从上述集合(观察了该对象)中移除
    public void delMyObserver(MyObserver myObserver)
    {
        if(myObserver != null)
            if (observers.contains(myObserver))
                observers.remove(myObserver);

    }

    //消息通知
    public void notifyAllObserver(Object obg){
        for (MyObserver obeserver: observers) {
            obeserver.update(this,obg);
        }
    }

    public void notifyAllObserver(){
        for (MyObserver obeserver: observers) {
            obeserver.update(this,null);
        }
    }

    public void notifyOneObserver(MyObserver myObserver,Object obg){
        myObserver.update(this,obg);
    }
}
