package homework.peopleandmoney;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:34 18-5-29
 * @Modified: null
 */
public class People extends Money {
    public People(String str) {
        super(str);
    }

    public void speak()
    {
        System.out.println("小样的，不错嘛，会说话了！");
    }

    public void think()
    {
        System.out.println("别说话，认真思考．．．");
    }
}
