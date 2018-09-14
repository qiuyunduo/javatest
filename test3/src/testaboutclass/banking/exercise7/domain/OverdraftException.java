package testaboutclass.banking.exercise7.domain;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:40 18-5-30
 * @Modified: 自定义异常类
 */
public class OverdraftException extends Exception {
    private double deficit;
    private String message;
    public OverdraftException(String message,double deficit) {
        this.message = message;
        this.deficit = deficit;
    }

    public void pintException(){
        System.out.println("Exception: "+message+" Deifcit:"+deficit);
    }

    public double getDeficit() {
        return deficit;
    }
}
