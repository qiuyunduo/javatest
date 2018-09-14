package thread.addandsub;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午10:32 18-5-25
 * @Modified: null
 */
public class YunSuanStart {
    public static void main(String[] args) {
        ThreadAddSub[] addSubs = new ThreadAddSub[4];

        for(int i = 0; i < 4; i++)
        {
            addSubs[i] = new ThreadAddSub(i%2 == 0 ? true : false,i+1);
            addSubs[i].start();
        }
    }

}
