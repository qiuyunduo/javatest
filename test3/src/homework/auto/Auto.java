package homework.auto;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:24 18-5-29
 * @Modified: null
 */
public class Auto {
    private int shoes;
    private String color;
    private float weight;
    private float speed;

    public  Auto(){
        this.shoes = 4;
        this.color = "黑色";
        this.weight = 1;
        this.speed = 200;
    }
    public Auto(int shoes, String color, float weight, float speed) {
        this.shoes = shoes;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
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
}
