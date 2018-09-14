package testaboutthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:52 18-6-13
 * @Modified: 使用Ｃａｌｌａｂｌｅ计算１＋．．．１００
 */
public class MyCallable implements Callable<Integer> {
    private int st;
    private int ed;

    public MyCallable(int st, int ed) {
        this.st = st;
        this.ed = ed;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = st; i <= ed ; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int sum = 0;
        List<FutureTask<Integer>> list = new ArrayList<>();
        for(int i = 0;i < 1000; i += 100) {
            MyCallable myCallable = new MyCallable(i,i+100);
            FutureTask<Integer> task = new FutureTask<Integer>(myCallable);
            new Thread(task).start();
            list.add(task);
        }

        for (FutureTask<Integer> f :list ) {
            sum += f.get();
        }

        System.out.println(sum);
    }
}
