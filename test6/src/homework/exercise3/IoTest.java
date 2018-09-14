package homework.exercise3;

import java.io.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:59 18-6-13
 * @Modified: null
 */
public class IoTest {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("info.txt"));
        while (flag){
            String str = br.readLine();
            if(str.equals("quit"))
                break;
            bw.write(str);
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}
