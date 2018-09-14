package sockettest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:03 18-6-20
 * @Modified: null
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServletSocket
        ServerSocket ss = new ServerSocket(2222);
        //服务一直监听客户端的请求
        Socket socket = ss.accept();
        //服务器已经和客户端建立连接，可以通信
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        //把字节流转换为字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        PrintStream ps = new PrintStream(os);
        //读取客户端的请求
        String line = br.readLine();
        System.out.println("获取的客户端的请求－－："+line);
        //输出流也就是对客户端的回应
        ps.println("请求查询网络通信的消息我已收到，你可以随时查询");
        socket.close();
    }
}
