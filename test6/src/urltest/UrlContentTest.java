package urltest;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:25 18-6-20
 * @Modified: null
 */
public class UrlContentTest {
    public static void main(String[] args) throws IOException {
        long st = System.currentTimeMillis();
        URL url = new URL("http://mpge.5nd.com/2016/2016-11-15/74847/1.mp3");

        URLConnection conn = url.openConnection();

        HttpURLConnection hc = (HttpURLConnection)conn;

        hc.setRequestMethod("GET");
        hc.setConnectTimeout(3000);
        System.out.println("文件长度"+conn.getContentLength());
        System.out.println("文件名字"+hc.getFileNameMap());

        File file = new File("1.mp3");
        if(!file.exists()){
            file.createNewFile();
        }

        OutputStream os = new FileOutputStream("1.mp3");

        InputStream is = url.openStream();

        byte[] bytes = new byte[1024*10];
        int lenght = -1;
        int total = 0;
        while ((lenght = is.read(bytes)) != -1){
            os.write(bytes,0,lenght);
        }

        is.close();
        os.close();
        System.out.println(System.currentTimeMillis()-st);
    }
}
