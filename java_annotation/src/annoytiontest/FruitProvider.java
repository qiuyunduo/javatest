package annoytiontest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:12 18-6-21
 * @Modified: null
 */
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
    String provider_name() default "江西";
    String address();

}
