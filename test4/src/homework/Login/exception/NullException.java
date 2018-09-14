package homework.Login.exception;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午2:13 18-5-31
 * @Modified: null
 */
public class NullException extends Exception{
        private String message;

        public NullException(String message)
        {
            this.message = message;
        }

        public void PrintExpection()
        {
            System.out.println(this.message);
        }
}
