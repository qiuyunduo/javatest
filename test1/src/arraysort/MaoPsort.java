package arraysort;

import java.util.Arrays;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午12:52 18-9-8
 * @Modified: null
 */
public class MaoPsort {
    public static void MSort(int[] arrary){
        for(int i=0; i<arrary.length-1;i++){
            for (int j=1; j<arrary.length-i; j++){
                if(arrary[j] > arrary[j-1]){
                    int temp = arrary[j-1];
                    arrary[j-1] = arrary[j];
                    arrary[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrary = {4,2,9,10,29,18,14,20};

        for(int i = 0; i < arrary.length; i++){
            System.out.print(arrary[i]+" ");
        }
        System.out.println();
//        MSort(arrary);
                Arrays.sort(arrary);
        for(int i = 0; i < arrary.length; i++){
            System.out.print(arrary[i]+" ");
        }
        System.out.println();
    }
}
