package testaboutIo;

import java.io.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:27 18-6-8
 * @Modified: null
 */
public class MyPrintStream {
    public static void main(String[] args) throws IOException {


        File fi = new File("test2/src/test2.txt");

        FileInputStream fis = new FileInputStream(fi);
        InputStreamReader sd = new InputStreamReader(System.in);
        byte[] bs = new byte[100];
        int len = 0;
        String str = "";
        while((len = fis.read(bs)) != -1){
            System.out.println((char)len+"");
        }
//        FileOutputStream fileOutputStream = new FileOutputStream(fi);
//        char chs = 's';
//        fileOutputStream.write(chs);

//
//        Reader reader = new FileReader("test2/src/test2.txt");
        BufferedReader bis = new BufferedReader(sd);
        while ((str = bis.readLine()) != null)
        System.out.println(str);
//        String str = "";
//        char ch;
//        while((str = bis.readLine()) != null)
//            System.out.println(str);
//
//        bis.close();
    }
}
