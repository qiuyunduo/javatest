package testaboutset;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:44 18-6-4
 * @Modified: null
 */
import java.util.Comparator;

public class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Animal p1=(Animal) o1;
        Animal p2=(Animal) o2;
        return p1.getAge()-p2.getAge();
    }

}