package homework.Vehicles;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:16 18-5-29
 * @Modified: null
 */
public class Truck extends Vehicles {
    private float load;

    public Truck(String brand, String color,float load) {
        super(brand, color);
        this.load = load;
    }

    @Override
    public void run()
    {
        System.out.println("我是一辆大卡车，已经开动了！！！");
    }

    public void showTruck()
    {
        System.out.println("商标：　"+brand+" 颜色：　"+color+" 载重：　"+load);
    }
}
