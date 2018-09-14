package testaboutthread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:22 18-6-13
 * @Modified: null
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
//        Runnable ra = pool
    }
}
