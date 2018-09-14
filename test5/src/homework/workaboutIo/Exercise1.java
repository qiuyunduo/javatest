package homework.workaboutIo;

import java.io.*;
import java.util.TreeSet;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:36 18-6-7
 * @Modified: null
 */
public class Exercise1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("test5/src/homework/workaboutIo/a.txt"));
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("test5/src/homework/workaboutIo/b.txt"));


            //接收ａ.txt文件中的内容
            StringBuffer strb = new StringBuffer();
            String str = "";

            while((str = br.readLine()) != null)
            {
                strb.append(str);
            }

            //将StringBuffer类转为String类进行操作
            String str1 = strb.toString();
            /*将得到的文本内容转为以字符数组形式存入TreeSet中，
              利用TreeSet的自动排序功能和不添加重复元素的特性完成要求
            */
            char[] chars = str1.toCharArray();
            TreeSet<String> set = new TreeSet<>();
            for (char ch :chars ) {
                set.add(String.valueOf(ch));
            }

            //将TreeSet中的元素依次输入到b.txt中
            for (String s :set ) {
                bw.write(s);
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
