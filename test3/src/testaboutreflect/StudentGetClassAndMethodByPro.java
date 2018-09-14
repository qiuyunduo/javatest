package testaboutreflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.Properties;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午4:14 18-6-1
 * @Modified: null
 */
public class StudentGetClassAndMethodByPro {
    public static String getValue(String key){
        String local = "";
        try {
            Properties pro = new Properties();
            FileInputStream in = new FileInputStream("test3/src/testaboutreflect/pro.txt");
            pro.load(in);
            in.close();
            local = pro.getProperty(key);
        }catch (IOException e){
            e.printStackTrace();
        }

        return local;
    }

    public static void main(String[] args) {
        try {
            Class aClass = Class.forName(getValue("className"));
            Method method = aClass.getMethod(getValue("methodName"),String.class);
            Object o = aClass.getConstructor().newInstance();
            method.invoke(o,"qo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
