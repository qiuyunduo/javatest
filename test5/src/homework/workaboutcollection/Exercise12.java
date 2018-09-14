package homework.workaboutcollection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午6:27 18-6-5
 * @Modified: null
 */
public class Exercise12 {

    public static void main(String[] args) {
        List nums = new ArrayList();
        int i = 10,num;
        int[] numbs = new int[10];
        StringBuffer str = new StringBuffer();

        while (nums.size() < 10) {
            num = (int) (Math.random() * 50);
            if (num % 2 == 0 && !nums.contains(num))
                nums.add(num);
        }
        Collections.sort(nums);
        for (Object o : nums) {
            numbs[--i] = (Integer) o;
        }

        int flag = 0;
        for (int a : numbs) {
            System.out.print(a+" ");
            if (flag == 0) {
                flag = 1;
                str.append(a);
                continue;
            }
            str.append(","+a);

        }
        System.out.println();
        System.out.println(str);

        try {
            FileOutputStream fos=new FileOutputStream("test5/src/homework/workaboutcollection/num.txt",true);
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            osw.write(str.toString());
            osw.flush();
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
