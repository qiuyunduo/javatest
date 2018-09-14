package homework.workaboutIo;

import java.io.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午10:26 18-6-7
 * @Modified: null
 */
public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("test5/src/homework/workaboutIo/消愁.txt"));
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("test5/src/homework/workaboutIo/key.txt"));

        StringBuffer strb = new StringBuffer();

        String str="";

        char ch1 = '我';

        int num = 0;
        while((str = br.readLine()) != null)
            strb.append(str);

        char[] chars = strb.toString().toCharArray();

        for (char ch : chars) {
            if(ch == ch1)
                num++;
        }

        bw.write(ch1);
        bw.write("=");
        bw.write(String.valueOf(num));

        bw.flush();
        bw.close();
        br.close();
        System.out.println(num);
    }

}
