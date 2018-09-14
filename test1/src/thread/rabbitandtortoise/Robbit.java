package thread.rabbitandtortoise;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:44 18-5-24
 * @Modified: null
 */
public class Robbit extends Animal {
    public  Robbit()
    {
        setName("兔子");
    }

    @Override
    public void running() {
        double dis = 0.5;  //兔子每秒跑得距离
        length -= dis;
        if(length <= 0){
            length = 0;
            System.out.println("兔子获得了胜利");
            if(calltoback != null)
                calltoback.win();
        }

        System.out.println("兔子跑了" + dis + "米,距离终点还有" + (int)length + "米");

        if(length % 2 == 0)
            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

    }
}
