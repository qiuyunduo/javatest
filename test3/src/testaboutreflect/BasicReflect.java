package testaboutreflect;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:31 18-5-29
 * @Modified: null
 */
public class BasicReflect{
    public static void main(String[] args) {
        Random random = new Random(12);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
//        for(int i = 0; i < 10; i++)
//        {
//            int date = random.nextInt(20);
//            System.out.println(date);
//        }
        Date date = new Date(1998,9,9);
        System.out.println(date.toString());

        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = date1.format(new Date());
        System.out.println(str);
        Timer timer = new Timer();
        System.out.println();



    }

}
