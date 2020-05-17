package basicknow;


public class SwitchDemo {
    public static void main(String[] args) {
        testSwitchNull("null");
        int a = 1,b = 1;
        int i = (b == a) ? 2 : 1;
    }

    public static void testSwitchNull(String str) {
        switch (str) {
            case "sth":
                System.out.println("it's sth");
                break;
            case "null":
                System.out.println("it's null");
                break;
            default:
                System.out.println("default");
        }
    }
}
