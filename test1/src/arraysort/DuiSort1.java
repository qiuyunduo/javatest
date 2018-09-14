package arraysort;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:28 18-9-14
 * @Modified: null
 */
public class DuiSort1 {
    /**
     * 堆排序
     * @param arrary
     */
    public static void DuiSort(int[] arrary){
        /**
         * 将一个无序堆调为有序堆
         */
        for(int i = arrary.length/2-1; i >= 0; i--){
            adjustHeap(arrary,arrary.length,i);
        }
        /**
         * 交换有序堆中根节点和尾节点，在调整使其为有序堆
         */
        for(int j = 0; j < arrary.length-1; j++){
            swap(arrary,arrary.length-j-1);
            adjustHeap(arrary,arrary.length-j-1,0);
        }


    }

    /**
     * 调整堆，使其符合大根堆（小跟堆）的性质
     * @param arrary
     * @param length
     * @param height
     */
    public static void adjustHeap(int[] arrary, int length, int height){
        int parentnode = arrary[height];

        for(int j = height*2+1; j < length; j = j*2+1){
            if(j+1 < length && arrary[j] < arrary[j+1]){
                j++;
            }

            if(arrary[j] > parentnode){
                arrary[height] = arrary[j];
                height = j;
            }else {
                break;
            }

        }

        arrary[height] = parentnode;
    }

    /**
     * 将此时堆的根节点与堆的最后一个节点交换
     * @param arrary
     */
    public static void swap(int[] arrary,int end){
        int temp = arrary[end];
        arrary[end] = arrary[0];
        arrary[0] = temp;
    }

    public static void main(String[] args) {
        int[] arrary = {27,19,29,38,9,8,20,30,59,27};
        for(int i = 0; i < arrary.length; i++){
            System.out.print(arrary[i]+" ");
        }
        System.out.println();
        DuiSort(arrary);
        for(int i = 0; i < arrary.length; i++){
            System.out.print(arrary[i]+" ");
        }
        System.out.println();
    }
}
