package basicknow;

public class breaklabel {
    public static void main(String[] args)
    {
        outer:
        for(int k = 0; k< 4; k++)
        {
            for (int i = 0; i < 4; i++)
            {
                System.out.println("k="+k+",i="+i);
                if ((i + k) == 5)
                {
                    System.out.println("k="+k+",i="+i+"  此时跳出多重循环．．．");
                    break outer;
                }
            }
        }
    }
}
