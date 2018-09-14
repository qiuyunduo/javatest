package testaboutIo;

import java.io.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:58 18-6-7
 * @Modified: null
 */
public class CopyBigFile {
    public static void main(String[] args) throws IOException {
//        FileInputStream fi1 = new FileInputStream("test2/src/test.txt");
//        FileOutputStream fo1 = new FileOutputStream("test2/src/test1.txt");

        FileReader fr1 = new FileReader("test2/src/test.txt");
        FileWriter fw1 = new FileWriter("test2/src/test2.txt");
        byte[] b = new byte[1024];
        char[] chs = new char[1024];

        int len = 0;
        long st = System.currentTimeMillis();
//        while ((len = fi1.read()) != -1){
//            fo1.write(len);
//        }
//        while ((len = fi1.read(b)) != -1){
//            fo1.write(b);
//        }
        while ((len = fr1.read(chs)) != -1){
            fw1.write(chs,0,len);
        }
        long ed = System.currentTimeMillis();
        System.out.println(ed-st);
        fw1.close();
        fr1.close();

        String s = "I Love Jaba, lalalalalalala";
        s = s.replaceAll("a", "x");
        System.out.println(s);


    }
}
