package arraysort;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午1:16 18-9-8
 * @Modified: null
 */
public class QuickSort {
    public static int count = 0;
    public static void QSort(int[] arrary,int left, int right){
        count++;
        int l = left;
        int r = right;
        int baseNumber = arrary[l];

        while(left < right){
            while(left < right && baseNumber <= arrary[right])
                right--;
            if(left < right){
                arrary[left] = arrary[right];
                arrary[right] = baseNumber;
                left++;
            }

            while(left<right && baseNumber >= arrary[left])
                left++;
            if(left < right){
                arrary[right] = arrary[left];
                arrary[left] = baseNumber;
                right--;
            }
            System.out.println("第"+count+"次排序过程");
            for(int i = 0; i < arrary.length; i++){
                System.out.print(arrary[i]+" ");
            }
            System.out.println();
        }

        if(l < left) QSort(arrary,l,left-1);
        if(r > right) QSort(arrary,right+1,r);
    }
    public static void main(String[] args) {
        int[] arrary = {20,213,23,41,2,34,5,6,7,3,123,4,14};
        QSort(arrary,0,arrary.length-1);
    }
}
