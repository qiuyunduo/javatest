package homework;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:38 18-5-24
 * @Modified: null
 */
public class printdate {
    public static void main(String[] args){
        System.out.println("N\t10*N\t100*N\t1000*N");
        for(int i = 1; i < 6; i++)
            System.out.println(i+"\t"+i*10+"\t\t"+100*i+"\t\t"+1000*i);
    }
}
