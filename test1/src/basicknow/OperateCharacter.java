package basicknow;

/**
 * @Author: qiuyunduo
 * @Description:
 * @Date: Created in 上午10:54 18-5-24
 * @Modified:
 */
public class OperateCharacter {
    public String transittwo(int num){
        StringBuffer result = new StringBuffer("");
        for(int i = 0; i < 32; i++) {
            result.append(num & 1);
            num = num >>> 1;
        }
        result.reverse();
        int index = result.indexOf("1");
        return result.toString().substring(index);
    }
    public static void main(String[] args){
        int a = 3<2 ? 6 : 8; //？号之前条件成立结果为紧跟？号的结果，否则为：号之后的结果
        System.out.println(a);
        int b = -2;
        int c = b >> 2;
        int d = b << 2;
        int e = b >>> 2;
        System.out.println(c+" "+d + " "+ e);
        int num = 15;
        OperateCharacter oc = new OperateCharacter();
        boolean ax = (oc instanceof OperateCharacter);
        System.out.println(ax);
        String result = oc.transittwo(num);
        System.out.println("十进制数"+num+"转为二进制为："+result);
    }
}
