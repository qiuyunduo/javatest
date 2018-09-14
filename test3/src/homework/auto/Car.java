package homework.auto;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:28 18-5-29
 * @Modified: null
 */
public class Car extends Auto {
    private boolean aircodition;
    private boolean CD;

    public void Speeding()
    {
        System.out.println("汽车更快加速！！！");
    }

    public void Slowing()
    {
        System.out.println("汽车更快减速！！！");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.Speeding();
        car.Slowing();
    }
}
