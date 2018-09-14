package testvm;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:30 18-6-6
 * @Modified: null
 */
public class vmposition {
    public static void get()
    {
        return;
    }
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            get();
        }
        long en = System.currentTimeMillis();
        System.out.println(en-st);
    }
}
