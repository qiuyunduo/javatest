package testaboutclass.others;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:59 18-5-29
 * @Modified: null
 */
public class Cylinder extends Circle{
    private double length;
    private double volume;
    public Cylinder(double radius,double length) {
        super(radius);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void getVolume()
    {
        volume = this.getAleras()*length;
        System.out.println("圆柱体体积为：　"+String.format("%.2f",volume));
    }
}
