package homework.workaboutother;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:17 18-6-5
 * @Modified: null
 */
public class Test {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(null,"dsd");
        map.put("sd",null);
        map.put(null,null);

        System.out.println(map);
    }

}
