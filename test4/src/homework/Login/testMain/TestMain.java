package homework.Login.testMain;

import java.util.Scanner;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午11:25 18-5-31
 * @Modified: null
 */
public class TestMain {
    public static void main(String[] args) {
//        Scanner in1 = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String str2 = in1.nextLine();
//        System.out.println(str2 == "zhang");
        boolean flag = true;
        while(flag) {

            Scanner in = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = in.nextLine();
            System.out.println("请输入密码：");
            String password = in.nextLine();

            if(username.equals("Tom") && password.equals("12345")){
                while (flag) {
                    try {
                        System.out.println("请输入金额：");
                        Scanner in1 = new Scanner(System.in);
                        int nums = in1.nextInt();
                    }catch (Exception e){
                        e.printStackTrace();
                        System.out.println("出现异常,输入不为整数,是否继续，继续输入Y 否则 输入N 退出");
                        Scanner in2 = new Scanner(System.in);
                        String str2 = in2.nextLine();
                        if(str2.equals("N"))
                            flag = false;
                    }
                }
            }else {
                System.out.println("用户名和密码不正确  是否重新输入，继续输入'Y' 否则 输入'N' 退出");
                String str = in.nextLine();
                System.out.println(str);
                if(str.equals("N"))
                    flag = false;
            }

        }
    }
}
