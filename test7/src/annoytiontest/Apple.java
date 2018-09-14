package annoytiontest;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:05 18-6-21
 * @Modified: null
 */
public class Apple {
    @FruitName(name = "苹果")
    private String name;
    @FruitColor(color="青色")
    private String color;

    @FruitProvider(provider_name = "红富士",address = "山东烟台")
    private String provider;

    public Apple(){

    }

    public Apple(String name, String color, String provider) {
        this.name = name;
        this.color = color;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}
