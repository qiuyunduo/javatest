package urltest;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:17 18-6-20
 * @Modified: null
 */
public class UrlTest {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        URL url = new URL("http://news.163.com/14/0806/19/A305TS8S00014SEH.html");
        System.out.println(url.getProtocol());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getHost());
        System.out.println(url.getFile());

        String host = url.getHost();
        InetAddress inetAddress = InetAddress.getByName(host);
        System.out.println(inetAddress.getHostAddress());

    }
}
