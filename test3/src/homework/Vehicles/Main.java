package homework.Vehicles;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:19 18-5-29
 * @Modified: null
 */
public class Main {
    public static void main(String[] args) {
        Vehicles vehicle = new Vehicles("五菱红光","黑色");
        vehicle.run();
        vehicle.showInfo();

        Car car = new Car("五菱红光","红色",5);
        car.run();
        car.showCar();

        Truck truck = new Truck("东风日产","白色",21.3f);
        truck.run();
        truck.showTruck();
    }
}
