package homework.Login.exception;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:05 18-5-31
 * @Modified: null
 */
public class AgeLittleException extends Exception {
    private String message;

    public AgeLittleException(String message)
    {
        this.message = message;
    }

    public void PrintExpection()
    {
        System.out.println(this.message);
    }
}
