package homework.workaboutmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:09 18-6-5
 * @Modified: null
 */
public class Exercise12 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();

        //1.使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述 课程安排
        hashMap.put("Tom","CoreJava");
        hashMap.put("John","Oracle");
        hashMap.put("Susan","Oracle");
        hashMap.put("Jerry","JDBC");
        hashMap.put("Jim","Unix");
        hashMap.put("Kevin","JSP");
        hashMap.put("Lucy","JSP");

        //2.增加了一位新老师Allen 教JDBC
        hashMap.put("Allen","JDBC");

        //3.Lucy 改为教CoreJava
        hashMap.put("Lucy","CoreJava");

        //4.1遍历Map，Set<String> get(key)
        Set<String> keys = hashMap.keySet();
        for (String key :keys ) {
            System.out.print(key+":"+hashMap.get(key)+"  ");
        }

        //4.2遍历Map，Set<Map.Entry<String,String>>
        System.out.println();
        Set<Map.Entry<String,String >> entries = hashMap.entrySet();
        for (Map.Entry<String,String > entry: entries) {
            System.out.print(entry.getKey()+":"+entry.getValue()+"  ");
        }
        System.out.println();

        //5.利用Map，输出所有教JSP 的老师。
        System.out.print("所有JSP教师：　");
        for (String key :keys ) {
            if(hashMap.get(key).equals("JSP"))
                System.out.print(key+" ");
        }



    }
}
