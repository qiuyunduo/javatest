package testaboutclass.others;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:57 18-5-28
 * @Modified: null
 */
public class Circle {
    public final static double pi = 3.14159;
    double radius,aleras;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getAleras(){
        aleras = radius*radius*pi;
        return aleras;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.getAleras();

    }
}
