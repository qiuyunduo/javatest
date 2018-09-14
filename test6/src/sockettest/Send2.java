package sockettest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:13 18-6-19
 * @Modified: null
 */
public class Send2 {

    private DatagramSocket socket;
    private byte[] bytes;
    private DatagramPacket packet;

    public Send2(){

        try {
            socket = new DatagramSocket(10000);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        bytes = new byte[1024];
        packet = new DatagramPacket(bytes,bytes.length);
    }

    public void StartSend() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();

            if(line.equals("quit")){
                break;
            }

            packet.setData(line.getBytes());
            packet.setLength(line.getBytes().length);
            packet.setPort(2222);
            packet.setAddress(InetAddress.getLocalHost());
            socket.send(packet);
        }
        socket.close();
    }


    public static void main(String[] args) throws Exception {
        Send2 send2 = new Send2();
        send2.StartSend();
    }
}
