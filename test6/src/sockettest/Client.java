package sockettest;

import java.io.*;
import java.net.Socket;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:42 18-6-20
 * @Modified: null
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建socket == 表明和服务建立连接
        Socket socket = new Socket("127.0.0.1",2222);
        //请求，由客户端发出的内容　request
        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
//        os.write("我需要查询网络编程的资料".getBytes());
        ps.println("我需要查询网络编程的资料");
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        System.out.println("收到服务器的回复－－－："+line);
        socket.close();
    }
}
