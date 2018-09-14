package testaboutmethods;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:46 18-5-27
 * @Modified: null
 */
public class MethodParams {
    public static void test(String str){
        System.out.println(str);
    }

    public static void test(String ... strs)
    {
        for (String str: strs) {
            System.out.println(str);
        }
    }
    public static void test(String str,int i){

    }
    public static void main(String[] args) {
        test("sdsds");
        test("Hello","World","nihao");
    }
}
