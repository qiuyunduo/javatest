package algorithmic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:32 18-6-12
 * @Modified: null
 */
public class MyBackDate2 {

    private static int solutions;
    private int queens;

    private long starttime;
    private long endtime;

    private int[] queen;

    public MyBackDate2(int n){
        this.queens = n;
        queen = new int[n];
        for (int i = 0; i < n; i++) {
            queen[i] = -1;
        }
    }

    public void start(){
        starttime = System.currentTimeMillis();
        backtrace();
        endtime = System.currentTimeMillis();
    }
//    public void place(){
//        int row = 0;
//
//        while(row >= 0){
//            queen[row]++;
//            while (queen[row] < queens){
//                if(Check(row,queen[row])) {
//                    if (row == queens - 1) {
//                        solutions++;
//                        PrintQueens();
//                        break;
//                    } else {
//                        queen[++row] = 0;
//                    }
//                }else {
//                    queen[row]++;
//                }
//            }
//            row--;
//        }
//    }

    public void backtrace(){
        int row = 0;

        while(row >= 0){
            queen[row]++;
            while(queen[row] < queens){
                if(Check(row,queen[row])) {
                    if (row == queens - 1) {
                        solutions++;
                        PrintQueens();
                        break;
                    }else {
                        queen[++row] = 0;
                    }
                }else {
                    queen[row]++;
                }
            }
            row--;
        }
    }

    /**
     * @Author: qiuyunduo
     * @Description:
     * @Date:下午2:09 18-6-12
     * @param row  正在排第几行皇后
     * @param coloum　　该皇后所在的列
     * @Return: null
     */
    public boolean Check(int row ,int coloum)
    {
//        PrintQueens();
        for (int i = 0; i < row; i++) {
            if(row-i == Math.abs(coloum-queen[i]) || coloum == queen[i])
                return false;
        }
        return true;
    }

    public void PrintQueens()
    {
        System.out.println("第"+solutions+"种解决方法");
        for (int i = 0; i < queens; i++) {
            System.out.print(queen[i]+" ");
        }
        System.out.println();
    }

    public void getTime(){
        System.out.println("总共耗费时间为："+(endtime-starttime));
    }

    public static void main(String[] args) {
        algorithmic.MyBackDate2 myBackDate2 = new algorithmic.MyBackDate2(9);
        myBackDate2.start();
        myBackDate2.getTime();
    }

}
