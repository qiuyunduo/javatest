package testaboutarrary;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:40 18-5-25
 * @Modified: null
 */
public class SplitArrayZero {
    public static void main(String[] args) {
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count = 0,length = 0;
        int newArr[];

        for(int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] == 0)
                count++;
            System.out.print(oldArr[i]+"  ");
        }
        System.out.println();
        length = oldArr.length-count;
        newArr = new int[length];
        for(int j = 0,k = 0; j < oldArr.length; j++)
            if(oldArr[j] != 0)
                newArr[k++] = oldArr[j];
        for(int n = 0; n < newArr.length; n++)
            System.out.print(newArr[n]+"  ");
    }
}
