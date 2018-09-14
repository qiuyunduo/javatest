package sockettest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:56 18-6-20
 * @Modified: null
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        // 创建socket===表明和服务器建立连接
        ServerSocket ss = new ServerSocket(65535);
        Socket socket = ss.accept();
        new Thread(new Runnable() {
            @Override
            public void run() {
//                while (true) {
                try {

                    OutputStream os = socket.getOutputStream();
                    InputStream is = socket.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String line = br.readLine();
                    System.out.println("客户端的问题：" + line);
                    PrintStream ps = new PrintStream(os);
                    ps.println("java实习工程师的工资为4500");
                    socket.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }

//            }
        }).start();
    }
}
