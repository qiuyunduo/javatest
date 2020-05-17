package D20190613;

public class Demo {
    public static void main(String[] args) {
        GT<String> gts = new GT<String>();
        gts.var = 1;
        GT<Integer> gti = new GT<Integer>();
        gti.var = 2;
        System.out.println(gts.var);

        GT1 gt1 = new GT1();
        gt1.var = 1;
        GT1 gt11 = new GT1();
        gt11.var = 2;
        System.out.println(gt1.var);
    }
}

class GT<T> {
    public static int var = 0;
    public void nothing(T t) {}
}


class GT1 {
    public static int var = 0;
}
