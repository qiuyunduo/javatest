package testaboutIo;

import java.io.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:16 18-6-6
 * @Modified: null
 */
public class IOStreamtest implements Serializable{
    public static void main(String[] args) throws FileNotFoundException {
        IOStreamtest io = new IOStreamtest();
        String file = "test2/src/test.txt";
        try {
            System.out.println(new Date(System.currentTimeMillis()));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(file));
            objectOutputStream.writeObject(io.new User("zhangsan",100));
            objectOutputStream.close();

            ObjectInputStream objectInputStream =
            new ObjectInputStream(new FileInputStream(file));
            User user = (User)objectInputStream.readObject();
            System.out.println(user);
            objectInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public class User implements Serializable{
        private String name;
        private int score;

        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }

}
