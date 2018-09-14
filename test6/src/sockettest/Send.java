package sockettest;

import java.io.IOException;
import java.net.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:44 18-6-19
 * @Modified: null
 */
public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10000);
        InetAddress address = InetAddress.getByName("172.20.10.5");
        int port = 8899;
        byte[] buf = "测试ｕｐｄ发送数据".getBytes();
        DatagramPacket datagramPa = new DatagramPacket(buf,buf.length,address,port);
        socket.send(datagramPa);
        socket.close();
    }
}
