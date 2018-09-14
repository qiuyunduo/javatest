package homework.workaboutIo;

import java.io.*;
import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午9:41 18-6-7
 * @Modified: null
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;
        Map<String,Integer> map = new HashMap<>();

        while(true){
            System.out.println("请输入打开文件a.txt的密码：");
            password = br.readLine();
            if(password.equals("heima")) {
                BufferedReader br1 = new BufferedReader(
                        new FileReader("test5/src/homework/workaboutIo/a.txt"));
                BufferedWriter bw = new BufferedWriter(
                        new FileWriter("test5/src/homework/workaboutIo/count.txt"));

                String str = null;
                StringBuffer strb = new StringBuffer();

                while ((str = br1.readLine()) != null)
                    strb.append(str);

                char[] chars = strb.toString().toCharArray();

                for (char ch :chars ) {
                    String s = String.valueOf(ch);
                    if(map.containsKey(s))
                        map.put(s,map.get(s)+1);
                    else
                        map.put(s,1);
                }

                Set<Map.Entry<String,Integer>> set = map.entrySet();

                for (Map.Entry<String,Integer> entry: set ) {
                    bw.write(entry.getKey()+":"+entry.getValue()+"个；");
                    bw.write("\r");
                    bw.write("\n");
                }
                bw.flush();
                bw.close();
                System.out.println("文件打开成功，请打开count.txt查看详情．");
                break;
            }
            else
                System.out.println("密码错误，请重新输入");
        }
    }
}
