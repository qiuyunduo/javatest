package arraysort;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午8:53 18-6-5
 * @Modified: null
 */
public class PrintSort {
    public static void main(String[] args) {
        int a[] = new int[10000];
        int b[] = new int[10000];

        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random()*10000);
            b[a[i]] += 1;
            System.out.print(a[i]+" ");

        }

        System.out.println("");
        for (int i = 0; i < 10000; i++) {
            while(b[i] > 0) {
                b[i]--;
                System.out.print(i+" ");
            }
        }
    }
}
