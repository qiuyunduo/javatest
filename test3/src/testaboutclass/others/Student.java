package testaboutclass.others;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:27 18-5-28
 * @Modified: null
 */
public class Student {
    private String num;
    private String name;
    private int age;
    private double height;
    private double weight;
    private double allscore;
    //定义一个空构造器，分别给所有属性，赋默认值。
    public Student(){
        num = "00000";
        name = "张三";
        age = 18;
        height = 170;
        weight = 120;
    }
    //定义一个对学号，和姓名赋给定值，年龄和身高为默认值的构造器
    public Student(String num,String name){
        this.num = num;
        this.name = name;
        age = 18;
        height = 170;
        weight = 120;
    }
    //定义一个对所有属性赋值的构造器。
    public Student(String  num,String name,int age,double height,double weight){
        this.num = num;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    /*
    定义一个方法 String check（） 根据以下的标准，返回这个学生的体重情况。


   体重指数 =  体重（公斤） 除 身高（米）的平方    kg/m2
   正常体重 ： 体重指数 = 18 - 25
    超重    ： 体重指数 = 25 - 30
   轻度肥胖 ： 体重指数 > 30
   中度肥胖 ： 体重指数 > 35
   重度肥胖 ：  体重指数 > 40
     */
    public String checked(){
        String result = "error";
        double index = 0;
        index = weight/Math.pow(height/100,2);
        if(index >= 40)
            result = "重度肥胖";
        else if(index >= 35)
            result = "中度肥胖";
        else if(index >= 30)
            result = "轻度肥胖";
        else if(25 <= index && index <= 30)
            result = "超重";
        else if(18 <= index && index <= 25)
            result = "正常体重";
        return result;
    }
    /*
    构建enjoy(String str) 和enjoy(String str,String str1)两个方法，表示学生有一个str和两个
    str 指定的爱好。把爱好输出
     */
    public void enjoy(String str){
        System.out.println("学生"+name+"的爱好有：　"+str);
    }
    public void enjoy(String str,String str1){
        System.out.println("学生"+name+"的爱好有：　" +str + ", " + str1);
    }
    /*
    增加一个属性 总分. 增加一个带可变参数的方法，传入任意个分数，计算总分，并把值赋给总分属性。
     */
    public void getScores(double ... scores){
        for (double score:scores) {
            allscore += score;
        }
        System.out.println("学生"+name+"总分为：　"+allscore);
    }
    /*分别对所有属性定义get 和set方法（要求 年龄在10-20之间，
    * 身高在100cm-200cm之间,体重在20kg-150kg之间）。
    */
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 10 && age <= 20)
            this.age = age;
        else
            System.out.println("年龄不合法");
    }

    public double getHeight() {
        return height;
    }
    //身高以cm为单位
    public void setHeight(double height) {
        if(height >= 100 && height <= 200)
            this.height = height;
        else
            System.out.println("身高不合法");

    }

    public double getWeight() {
        return weight;
    }
    //体重以kg为单位
    public void setWeight(double weight) {
        if(weight >= 20 && weight <= 150)
            this.weight = weight;
        else
            System.out.println("身高不合法");

    }

}
