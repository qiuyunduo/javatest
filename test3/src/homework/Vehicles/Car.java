package homework.Vehicles;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:10 18-5-29
 * @Modified: null
 */
public class Car extends Vehicles {
    private int seats;

    public Car(String brand, String color,int seats) {
        super(brand, color);
        this.seats = seats;
    }

    @Override
    public void run()
    {
        System.out.println("我是一辆小汽车，已经开动了！！！");
    }

    public void showCar()
    {
        System.out.println("商标：　"+brand+" 颜色：　"+color+" 座位：　"+seats);
    }
}
