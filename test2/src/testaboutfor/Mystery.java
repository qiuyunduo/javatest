package testaboutfor;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:34 18-5-24
 * @Modified: null
 */
public class Mystery {
    public static void main (String [] args )
    {
        int y, x = 1 , total = 0 ;
        while (x++ <= 10)
        {
            y = x*x;
            System.out.println( y );
            total += y;
            System.out.println( "Total is"+total );
        }
    }
}
