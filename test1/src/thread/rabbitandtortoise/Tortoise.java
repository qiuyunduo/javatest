package thread.rabbitandtortoise;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:58 18-5-24
 * @Modified: null
 */
public class Tortoise extends Animal {
    @Override
    public void running() {
        double dis = 0.1;  //兔子每秒跑得距离
        length -= dis;
        if(length <= 0){
            length = 0;
            System.out.println("乌龟获得了胜利");
            if(calltoback != null)
                calltoback.win();
        }

        System.out.println("乌龟跑了" + dis + "米,距离终点还有" + (int)length + "米");

        try{
            sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
