package algorithmic;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:54 18-6-10
 * @Modified: null
 */
public class NQueensII {
    int[] x;//当前解
    int N;//皇后个数
    int sum = 0;//当前已找到的可行方案数
    public void printQueens(){
        for (int i = 1; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public int totalNQueens(int n) {
        N = n;
        x = new int[N+1];
        backTrace(1);
        return sum;
    }
    /**
     * col行这个点，x[col]列这个点，与已经存在的几个皇后，是否符合要求，放到这个位置上，
     * @param col
     * @return
     */
    private boolean place(int col){
        for(int i = 1; i < col; i++){
            if(Math.abs(col - i)==Math.abs(x[col]-x[i])||x[col]==x[i]){
                return false;
            }
        }
        return true;
    }
    private void backTrace(int t) {
        if(t>N){
            sum++;
//            printQueens();
        }else {
            //第t行，遍历所有的节点
            for(int j = 1; j <= N; j++) {
                x[t] = j ;
                //如果第j个节点可以放下皇后
                if(place(t)){
                    //接着放下一个
                    backTrace(t+1);
                }
            }
        }

    }
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        NQueensII n = new NQueensII();
        System.out.println(n.totalNQueens(14));
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

    }
}
