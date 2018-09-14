package sockettest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:50 18-6-19
 * @Modified: null
 */
public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10000);
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);

        int port = packet.getPort();

        InetAddress address = packet.getAddress();

        String ip = address.getHostAddress();

        buf = packet.getData();

        String content = new String(buf,0,buf.length);
        System.out.println(port+"---------"+ip+"-----"+content);
        socket.close();

    }
}
