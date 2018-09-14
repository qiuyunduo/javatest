package thread;

import java.io.IOException;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:56 18-9-2
 * @Modified: null
 */
public class CreateProce {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("wps");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
