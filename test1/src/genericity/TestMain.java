package genericity;

/**
 * @Author qyd
 * @Date 19-5-31 上午11:42
 * @Desc 泛型的简单理解
 **/
public class TestMain {
    public static void main(String[] args) {
        TestDemo<String,Integer, Long> testDemo = new TestDemo<>();

        testDemo.setParams1("qiuyunduo");
        testDemo.setParams2(21);
        testDemo.setParams3(System.currentTimeMillis());

        System.out.println(testDemo);
    }
}
