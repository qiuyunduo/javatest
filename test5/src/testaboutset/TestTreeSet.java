package testaboutset;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:42 18-6-4
 * @Modified: null
 */
import java.util.TreeSet;
/**
 * TreeSet:有序，基本数据类型已经实现排序
 * @author Administrator
 *
 */
public class TestTreeSet {

    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add("a");
        set.add("b");
        set.add("g");
        set.add("h");
        set.add("e");
        set.add("f");

        //set.add(3);
        TreeSet set1=new TreeSet();
        set1.add(3);
        set1.add(2);
        set1.add(1);
        System.out.println(set);
        System.out.println(set1);
        System.out.println("**********");
        //TreeSet存放自定义类型
        TreeSet set2=new TreeSet();
        set2.add(new Person("张三", 18));
        set2.add(new Person("李四", 23));
        set2.add(new Person("王五", 20));
        MyComparator comparator=new MyComparator();
        TreeSet set3=new TreeSet(comparator);
        set3.add(new Animal( 18));
        set3.add(new Animal( 23));
        set3.add(new Animal( 20));
        System.out.println(set3);
        //集合中元素的类型 临时变量：集合对象
        for (Object object : set3) {
            System.out.println(object);
        }
        //System.out.println(set2);
        for (Object object : set2) {
            System.out.println(object);
        }
    }
}
