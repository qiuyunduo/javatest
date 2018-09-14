package homework.workaboutmap;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:25 18-6-5
 * @Modified: null
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        String year = in.next();

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("2006","意大利");
        hashMap.put("2002","巴西");
        hashMap.put("1998","法国");
        hashMap.put("1994","巴西");
        hashMap.put("1990","德国");
        hashMap.put("1986","阿根廷");
        hashMap.put("1982","意大利");
        hashMap.put("1978","阿根廷");
        hashMap.put("1974","德国");
        hashMap.put("1970","巴西");
        hashMap.put("1966","英格兰");

        Set set = hashMap.keySet();
        if (set.contains(year))
            System.out.println(hashMap.get(year));
        else
            System.out.println("该年份没有举办世界杯．．．");


        List<Integer> list = new ArrayList();
        System.out.println("请输入一个球队名称：");
        String name = in.next();

        for (Object key : set) {
            if(hashMap.get(key).equals(name))
                list.add(Integer.parseInt(key.toString()));
        }

        if(list.isEmpty())
            System.out.println("没有获得过世界杯．．．");
        else {
            Collections.sort(list);
            for (int a : list) {
                System.out.print(a+" ");
            }
        }


    }
}
