package thread.rabbitandtortoise;

/**
 * @Author: qiuyunduo
 * @Descriptio
    要求：龟兔赛跑：20米     //只要为了看到效果，所有距离缩短了
    1.兔子每秒0.5米的速度，每跑2米休息10秒，
    2.乌龟每秒跑0.1米，不休息
    3.其中一个跑到终点后另一个不跑了！
 * @Date: Created in 下午5:00 18-5-24
 * @Modified: null
 */
public abstract class Animal extends Thread {
    public double length=5; //比赛长度

    public abstract void running();  //抽象方法需要子类实现

    //在父类重写ru方法，在子类只要重写runing方法就可以
    @Override
    public void run(){
        super.run();
        while(length>0){
            running();
        }
    }


    //再需要回调数据的地方（两个子类需要），声明一个接口
    public static interface Calltoback{
        public void win();
    }


    //创建接口对象
    public Calltoback calltoback;

}
