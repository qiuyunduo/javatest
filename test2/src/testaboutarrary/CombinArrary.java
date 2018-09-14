package testaboutarrary;

import java.util.Arrays;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:22 18-5-25
 * @Modified: null
 */
public class CombinArrary {
    public static void main(String[] args) {
        int[] array1 = {1,7,9,11,13,15,17,19};
        int[] array2 = {2,4,6,8,10};
        int length = array1.length+array2.length;
        int[] arrary3;
        arrary3 = new int[length];
        System.out.println(arrary3.length);
        for(int i = 0; i < array1.length; i++){
            arrary3[i] = array1[i];
        }
        for(int j = array1.length, n=0 ; j < length; j++,n++){
            arrary3[j] = array2[n];
        }
        System.out.println("合并后");
        for(int k = 0; k < arrary3.length; k++)
            System.out.print(arrary3[k]+"  ");
        Arrays.sort(arrary3);
        System.out.println();
        System.out.println("排序后");
        for(int k = 0; k < arrary3.length; k++)
            System.out.print(arrary3[k]+"  ");
    }
}
