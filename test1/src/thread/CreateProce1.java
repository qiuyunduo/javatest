package thread;

import java.io.IOException;

/**
 * @Author: qiuyunduo
 * @Description: 开启一个系统进程
 * @Date: Created in 下午7:56 18-9-2
 * @Modified: null
 */
public class CreateProce1 {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder("wps");
        try {
            processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
