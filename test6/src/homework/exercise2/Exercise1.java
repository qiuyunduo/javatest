package homework.exercise2;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:35 18-6-12
 * @Modified: null
 */
public class Exercise1 implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println(Thread.currentThread().getName() + "正在通过山洞．．．");
        }
    }

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();

        String[] name = {"张1","张2","张3","张4","张5","张6","张7","张8","张9","张10"};

        List<Integer> listname = new ArrayList();

        for (int i = 0; i < 10; i++) {
            listname.add(i);
        }

        Collections.shuffle(listname);

        System.out.println(listname);

        for (int i = 0; i < listname.size(); i++) {
            new Thread(e1,name[listname.get(i)]).start();
        }
    }
}
