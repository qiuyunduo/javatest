package homework.exercise3;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:52 18-6-13
 * @Modified: null
 */
public class MaoPaoSort {
    public static void main(String[] args){
        int [] a = {9,5,7,8,1,3,2,6,4};
        for(int i = 0; i < a.length-1; i++)
        for(int j = i+1; j < a.length;j++)
        if(a[i] > a[j])
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for(int i = 0; i < a.length; i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
}
