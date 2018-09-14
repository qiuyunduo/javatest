package homework;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:44 18-5-24
 * @Modified: null
 */
public class printdate1 {
    public static void main(String[] args){
        boolean flag;
        int coloum = 0;
        for(int i = 2; i < 10001; i++){
            flag = true;
            for(int j = 2; j <= (int)Math.sqrt(i); j++)
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            if(flag) {
                System.out.printf("%-8d",i);
                coloum++;
                if(coloum % 8 == 0)
                    System.out.println();
            }

        }
    }
}
