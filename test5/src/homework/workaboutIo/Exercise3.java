package homework.workaboutIo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:48 18-6-7
 * @Modified: null
 */
public class Exercise3 {
    public static void main(String[] args) {
        try {
            Map<String,String> map = new HashMap<String,String>();

            BufferedReader br = new BufferedReader(
                    new FileReader("test5/src/homework/workaboutIo/User.txt"));
            String str = "";
            StringBuffer strb = new StringBuffer();
            while((str = br.readLine()) != null)
            {
                String[] strs = str.split(",");
                String name = strs[0].split("=")[1];
                String pwd = strs[1].split("=")[1];
                map.put(name,pwd);
            }

            br.close();
            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String name = null, password = null;
                System.out.print("请输入你的名字：");
                name = br1.readLine();
                System.out.print("请输入你的密码：");
                password = br1.readLine();

                if (map.containsKey(name)) {
                    if (map.get(name).equals(password)){
                        System.out.println("恭喜你，登录成功！");
                        break;
                    }
                    else
                        System.out.println("密码错误．．．");
                } else
                    System.out.println("用户名错误．．．");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
