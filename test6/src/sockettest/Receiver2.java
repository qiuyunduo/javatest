package sockettest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:32 18-6-19
 * @Modified: null
 */
public class Receiver2 {

    private DatagramSocket socket;
    private byte[] bytes;
    private DatagramPacket packet;

    public Receiver2(){

        try {
            socket = new DatagramSocket(2222);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        bytes = new byte[1024];
        packet = new DatagramPacket(bytes,bytes.length);
    }

    public void StartReceier() throws Exception{

        while(true){
            socket.receive(packet);

            byte[] buf = packet.getData();
            int len = packet.getLength();
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println(ip+" "+port+" "+new String(buf,0,len));
        }
//        socket.close();
    }


    public static void main(String[] args) throws Exception {
        Receiver2 receiver2 = new Receiver2();
        receiver2.StartReceier();
    }
}
