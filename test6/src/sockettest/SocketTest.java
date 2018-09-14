package sockettest;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:18 18-6-19
 * @Modified: null
 */
public class SocketTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();

        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());

        inetAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress.getHostAddress());

        InetAddress[] inetAddresss = InetAddress.getAllByName("www.baidu.com");
        for (InetAddress i :inetAddresss ) {
            System.out.println(i.getHostAddress());
        }
    }
}
