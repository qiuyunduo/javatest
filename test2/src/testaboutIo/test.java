package testaboutIo;

import java.io.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:31 18-7-3
 * @Modified: null
 */
public class test {
    public static void main(String[] args) throws IOException {
        File file= new File("test2/src/test2.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();


        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("我是后加上去的\n");
        bw.write("我是刚才加上去的\n");
        bw.write("我是之后加上去的\n");
        bw.write("我是很早之前加上去的\n");
        bw.close();

        InputStream is = new FileInputStream(file);
        OutputStream os = new FileOutputStream(file);
        Reader reader = new FileReader(file);
        Writer writer = new FileWriter(file);
        Reader reader1 = new InputStreamReader(is);
        Writer writer1 = new OutputStreamWriter(os);

    }
}
