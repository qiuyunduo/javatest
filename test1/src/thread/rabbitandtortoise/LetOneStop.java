package thread.rabbitandtortoise;

/**
 * @Author: qiuyunduo
 * @Description: 让一个动物线程停止
 * @Date: Created in 下午8:19 18-5-24
 * @Modified: null
 */
public class LetOneStop implements Animal.Calltoback{

    Animal an;

    public  LetOneStop(Animal an)
    {
        this.an = an;
    }
    @Override
    public void win() {
        an.stop();
    }
}
