package algorithmic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:18 18-6-11
 * @Modified: null
 */
public class MyBackDate1 {
    private int counts;
    private int upperlim = 1;

    public MyBackDate1(int queens)
    {
        counts = 0;
        upperlim = (upperlim << queens) -1;
    }

    public void Permutation(long row,long ld,long rd){
        if(row != upperlim) {
            long pos = upperlim & ~(row | ld | rd);  //获得该行皇后所有能放置的位置　形如：0101　0表示不能放的位置,１表示能放的位置

            while (pos != 0) { //没有得到0000 就取到其中最右边的一个１
                long p = pos & -pos;//pos & (~pos + 1)
                pos -= p;

                Permutation(row + p, (ld + p) << 1, (rd + p) >> 1);

            }
        }else {
            counts++;
        }
    }

    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        MyBackDate1 myBackDate1 = new MyBackDate1(16);
        myBackDate1.Permutation(0,0,0);
        System.out.println(myBackDate1.counts);
        long ed = System.currentTimeMillis();
        System.out.println("总计耗费时间："+(ed-st));
    }
}
