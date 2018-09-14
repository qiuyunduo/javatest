package homework.Login.exception;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:03 18-5-31
 * @Modified: null
 */
public class AgeBigException extends Exception {
    private String message;

    public AgeBigException(String message)
    {
        this.message = message;
    }

    public void PrintExpection()
    {
        System.out.println(this.message);
    }
}
