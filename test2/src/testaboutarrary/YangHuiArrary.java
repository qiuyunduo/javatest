package testaboutarrary;

import java.util.Arrays;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:52 18-5-25
 * @Modified: null
 */
public class YangHuiArrary {
    static final int length = 6;
    public static void main(String[] args) {
        int[][] arr = new int[length][];
        System.out.println(arr.hashCode());
        for(int i = 0; i < length; i++)
        {
            arr[i] = new int[i+1];
        }
        for(int j = 0; j < length; j++)
            for(int k = 0; k < arr[j].length; k++)
                if(k == 0 || k == arr[j].length-1)
                    arr[j][k] = 1;
                else
                    arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
        for(int j = 0; j < length; j++) {
            for (int k = 0; k < arr[j].length; k++)
                System.out.printf("%-6d",arr[j][k]);
            System.out.println();
        }



//        int[]arr1 = {1,2,3,4,5,67,8,9};
//        int[]arr = new int[10];
//        System.arraycopy(arr1,0,arr,0,8);
//        System.out.println(Arrays.toString(arr));
    }
}
