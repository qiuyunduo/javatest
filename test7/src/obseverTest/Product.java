package obseverTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:44 18-8-14
 * @Modified: null
 */
public class Product extends Observable {
    private List<String> products = null;

    private static Product instance;
    private Product(){

    }

    public static Product getInstance(){
        if(instance == null){
            instance = new Product();
            instance.products = new ArrayList<>();
        }

        return instance;
    }

    public void addProductObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String product){
        System.out.println("添加商品"+product);
        products.add(product);
        this.setChanged();
        this.notifyObservers(product);
    }

    public void sayHello(){
        System.out.println("Hello world!!!");
    }
}
