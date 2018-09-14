package testaboutreflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:04 18-6-1
 * @Modified: null
 */
public class StudentGetMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        try {
            //获得Student的字节吗对象
            Class aClass = Class.forName("testaboutreflect.Student");

            //获得main方法
            Method mainMehhod = aClass.getMethod("main",String[].class);

            //调用main方法
            // methodMain.invoke(null, new String[]{"a","b","c"});
            //第一个参数，对象类型，因为方法是static静态的，所以为null可以，第二个参数是String数组，这里要注意在jdk1.4时是数组，jdk1.5之后是可变参数
            //这里拆的时候将  new String[]{"a","b","c"} 拆成3个对象。。。所以需要将它强转
            //方法一
            //mainMehhod.invoke(null,(Object) new String[]{"A","s","d"});
            //方法二
            mainMehhod.invoke(null,new Object[]{new String[]{"A","s","d"}});




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
