package homework.WuMingFen;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:39 18-5-29
 * @Modified: null
 */
public class WuMingFen {
    private String theMa;
    private int quantity;
    private boolean likeSoup;

    public WuMingFen(String theMa, int quantity, boolean likeSoup) {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, int quantity) {
        this.theMa = theMa;
        this.quantity = quantity;
    }

    public WuMingFen()
    {
        this.theMa = "酸辣";
        this.quantity = 2;
        this.likeSoup = true;
    }

    public void check()
    {
        System.out.println("面码：　"+theMa+"分量：　"+quantity+"是否带汤：　"+likeSoup);
    }

    public static void main(String[] args) {
        WuMingFen w = new WuMingFen();
        w.check();
        WuMingFen w1 = new WuMingFen("牛肉",3,true);
        w1.check();
        WuMingFen w2 = new WuMingFen("牛肉",2);
        w2.check();
    }
}
