package thread.station;

import thread.station.Station;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:57 18-5-24
 * @Modified: null
 */
public class StationLogin {
    /**
     * java多线程同步锁的使用
     * 示例：三个售票窗口同时出售10张票
     * */
    public static void main(String[] args){
        Station station1 = new Station("张三");
        Station station2 = new Station("李四");
        Station station3 = new Station("王五");

        station1.start();
        station2.start();
        station3.start();

    }
}
