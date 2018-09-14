package arraysort;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:17 18-9-8
 * @Modified: null
 */
public class ErFenFind {
    public static int EFfind(int[] arrary,int start,int end,int number ){
        int index = 0;
        int middle = (start+end)/2;
        if(number == arrary[middle]){

            return middle;
        }

        if(arrary[middle] > number){
            index = EFfind(arrary,start,middle-1,number);
        }
        if(arrary[middle] < number){
            index = EFfind(arrary,middle+1,end,number);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arrary = {1,2,3,4,5,6,7,8,9,10,48,92,103,483,893};
        int a = EFfind(arrary,0,arrary.length-1,100);
        System.out.println(a);
    }
}
