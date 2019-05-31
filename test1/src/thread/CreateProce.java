package thread;

import java.io.IOException;

/**
 * @Author: qiuyunduo
 * @Description: 开启一个进程
 * @Date: Created in 下午7:56 18-9-2
 * @Modified: null
 */
public class CreateProce {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            //runtime.exec最终还是调用ProcessBuild操作
            runtime.exec("wps");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
