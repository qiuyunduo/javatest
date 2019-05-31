package annoytiontest;

import java.lang.reflect.Field;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:12 18-6-21
 * @Modified: null
 */
public class AppleTest {
    public static void main(String[] args) {
        Class cls = Apple.class;
        Field[] fields = cls.getDeclaredFields();

        for (Field fi : fields) {
            if(fi.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = fi.getAnnotation(FruitName.class);
                System.out.println("姓名字段上的注解：　"+fruitName.name());
            }
            if(fi.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = fi.getAnnotation(FruitColor.class);
                System.out.println("颜色字段上的注解：　"+fruitColor.color());
            }
            if(fi.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = fi.getAnnotation(FruitProvider.class);
                System.out.println("供应商字段上的注解：　"+fruitProvider.provider_name()+" 　地址：　"+fruitProvider.address());
            }
        }
    }
}
