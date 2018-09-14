package thread.rabbitandtortoise;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:22 18-5-24
 * @Modified: null
 */
public class StartCompeter {
    public static void main(String[] args){
        Tortoise tortoise = new Tortoise();
        Robbit robbit = new Robbit();

        LetOneStop letOneStop1 = new LetOneStop(tortoise);
        robbit.calltoback = letOneStop1;

        LetOneStop letOneStop2 = new LetOneStop(robbit);
        tortoise.calltoback = letOneStop2;

        tortoise.start();
        robbit.start();
    }
}
