package arraysort;

/**
 * @Author qyd
 * @Date 19-5-31 下午5:33
 **/
public class DuiPai {

    public static void sort(int[] arrarys) {

    }

    public static void init(int[] arrarys) {
        int length = arrarys.length;
        for(int i = length/2 - 1; i > 0; i--) {
            int j = 2 * i  + 1;
            if(j < length && arrarys[j] > arrarys[j+1])
                j++;
            if(arrarys[j] > arrarys[i]) {
                swap(arrarys,i, j);
            }
        }
    }

    public static void swap(int[] arrarys, int a, int b) {
        int temp =arrarys[a];
        arrarys[a] = arrarys[b];
        arrarys[b] = temp;
    }

    public static void main(String[] args) {
        int[] arrarys = new int[]{12,4,23,2,3,43,2,32,423,324,234,21,36,44,234};
        for(int i = 0; i < arrarys.length; i++) {
            System.out.print(arrarys[i]+" ");
        }
        System.out.println();
        sort(arrarys);
        for(int i = 0; i < arrarys.length; i++) {
            System.out.print(arrarys[i]+" ");
        }
        System.out.println();
    }
}
