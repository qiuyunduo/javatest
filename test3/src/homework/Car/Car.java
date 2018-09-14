package homework.Car;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:28 18-5-29
 * @Modified: null
 */
public class Car {
    private int shoes;
    private String color;
    private double weight;

    public Car()
    {
        this.shoes = 4;
        this.color = "白色";
        this.weight = 1;
    }

    public Car(int shoes, String color, double weight) {
        this.shoes = shoes;
        this.color = color;
        this.weight = weight;
    }

    public Car(int shoes, String color) {
        this.shoes = shoes;
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }

    public void Speeding()
    {
        System.out.println("汽车加速！！！");
    }

    public void Slowing()
    {
        System.out.println("汽车减速！！！");
    }

    public void Stop()
    {
        System.out.println("停车！！！");
    }

    public static void main(String[] args) {
        Car car = new Car(3,"黑色",3.3);
        car.Speeding();
        car.Slowing();
        car.Stop();
    }
}
