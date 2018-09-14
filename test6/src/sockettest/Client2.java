package sockettest;

import java.io.*;
import java.net.Socket;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:47 18-6-20
 * @Modified: null
 */
public class Client2 {
    public static void main(String[] args) throws IOException {
        // 创建socket===表明和服务器建立连接
        Socket socket = new Socket("127.0.0.1", 65535);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OutputStream os = socket.getOutputStream();
                    PrintStream ps = new PrintStream(os);

                    while (true){
                        String line = br.readLine();
                        if(line.equals("quit")){
                            break;
                        }
                        ps.println("我要咨询java工程师的实习工资");
                    }

                    //服务器的相应，回复response
                    InputStream is = socket.getInputStream();
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(is));

                    String line1 = br.readLine();
                    System.out.println("收到服务器的回复－－－："+line1);
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
