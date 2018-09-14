package basicknow;

public class WhileAndDowhile {
    public static void main(String[] args)
    {
        int a = 3;
        while(a-- > 0) {
            System.out.println(a);
        }
        int b = 3;
        do{
            System.out.println(b);
        }while(b-- > 0);
        int c = 6;
        while(c-- > 0) {
            switch (c) {
                case 1:
                    System.out.println("此时ｃ＝1");
                    break;
                case 2:
                    System.out.println("此时ｃ=2 " + c);
                    break;
                case 3:
                    System.out.println("此时ｃ＝3  " + c);
                    break;
                case 4:
                    System.out.println("此时ｃ＝4  " + c);
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}
