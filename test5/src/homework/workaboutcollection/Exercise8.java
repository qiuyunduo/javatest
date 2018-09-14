package homework.workaboutcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午10:58 18-6-4
 * @Modified: null
 */
public class Exercise8 {

    public static void main(String[] args) {
        Set set1 = new TreeSet();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        Set set2 = new TreeSet();
        set2.add("d");
        set2.add("e");
        set2.add("f");
        set2.add("g");
        set2.add("h");
        Set set3 = new TreeSet();
        Iterator it1 = set1.iterator();
        Iterator it2 = set2.iterator();

        System.out.println("Set1集合：");
        for (Object o : set1) {
            System.out.print(o + " ");
            set3.add(o);
        }
        System.out.println();

        System.out.println("Set２集合：");
        for (Object o : set2) {
            System.out.print(o + " ");
            set3.add(o);
        }
        System.out.println();

        System.out.println("合并后的集合Set3集合：");
        for (Object o : set3)
            System.out.print(o+" ");

        System.out.println();



    }



}
