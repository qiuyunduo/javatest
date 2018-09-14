package arraysort;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:01 18-6-4
 * @Modified: null
 */
public class DuiSort {
    /**
     * 堆排序
     */
    public static void heapSort(int[] array)
    {
        int length = array.length;
        //构建堆
        for (int i = length/2-1; i >= 0 ; i--) {
            //自下而上调整堆
            adjustDui(array,i,length);
        }
        for (int j = length-1; j > 0 ; j--) {
            SwapNode(array,0,j);
            //自上而下调整
            adjustDui(array,0,j);

        }

    }

    /**
     * 调整堆
     */
    public static void adjustDui(int[] array, int i,int length)
    {
        int temp = array[i];

        System.out.println("start");
        for (int j = 2*i+1; j < length; j=2*j+1) {
            System.out.println(array[i]+".................   ");
            if(j+1<length && array[j] > array[j+1])
                j++;
            if(array[j] < temp){
                array[i] = array[j];
                i = j;
            }else {
                break;
            }
        }
        System.out.println("end");

        array[i] = temp;

    }



    /**
     * 将大根堆的人root节点元素与末尾节点元素进行交换
     */
    public static void SwapNode(int[] array, int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }

    public static void main(String[] args) {
        int a[] = {12,34,91,1,34,4,9,30,48};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();
        heapSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        System.out.println();


    }
}
