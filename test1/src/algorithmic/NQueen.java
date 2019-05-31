package algorithmic;

/**
 * @Author: qiuyunduo
 * @Description: n皇后问题求解，递归求解
 * @Date: Created in 上午11:06 18-6-11
 * @Modified: null
 */
public class NQueen {
    private int n;
    private int count;
    private int[] arr;
    private int num;

    public NQueen(int n) {
        this.n = n;
        count = 0;
        arr = new int[n];
        num = (1 << n) - 1;
    }

    /** row col
     *  i  arr[i]
     *
     */
    public boolean check(int col, int row){
        for(int i = 0; i < row; i++){
            if(col == arr[i] || Math.abs(row-i) == Math.abs(col-arr[i])){
                return false;
            }
        }
        return true;
    }

    public void CalNqueen(int k){
        if(k == n){
            count++;
            //display();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(check(i, k)){
                arr[k] = i;
                CalNqueen(k+1);
            }
        }

    }

    public void CalNqueen(int l, int r, int k){
        if(k == num){
            count++;
        }
        int a = num & (~(l | r | k));
        while (a != 0){
            int b = a & (~a+1);
            a -= b;
            CalNqueen((l|b) << 1 , (r|b) >> 1, k|b);
        }
    }

    public int getCount() {
        return count;
    }

    public void display(){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        NQueen nQueen = new NQueen(4);
        nQueen.CalNqueen(0,0,0);
        System.out.println(nQueen.getCount());
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

