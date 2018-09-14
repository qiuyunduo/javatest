package testaboutobserver;

import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:47 18-6-2
 * @Modified: null
 */
public class Product extends MyObservered {
    private String name;
    private double price;

    public Product(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    //当该商品价格发生变动时候，通知所有收藏了该产品的用户
    public void setPrice(double price) {
        this.price = price;
        notifyAllObserver(new Double(price));
    }
}
