package homework.exercise3;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:54 18-6-13
 * @Modified: null
 */
public class  A{
    private static A a;
    private int s = 3;

    private A(){}

    private static A getA(){
        if(a == null){
            a = new A();
            return a;
        }else{
            return a;
        }
    }

    private int getS(){
        return s;
    }

    private void setS(int s){
        this.s = s;
    }
    public static void main(String[] args){
        A a = A.getA();
        System.out.println(a.getS());
        a.setS(100);
        A b = A.getA();
        System.out.println(b.getS());

    }
}
