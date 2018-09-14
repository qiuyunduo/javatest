package algorithmic;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午7:23 18-6-10
 * @Modified: null
 */
public class BackDate {
    public static final int queens = 8;
    public static int g_answers = 0;

    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        List<Integer> locals = new ArrayList<>();

        Permutation(locals,0);
        long ed = System.currentTimeMillis();
        System.out.println(g_answers);
        System.out.println(ed-st);
    }

    public static void Permutation(List<Integer> locals,int index){
//        System.out.println(locals+" "+locals.size());
        if(queens == locals.size())
        {
            g_answers++;
            PrintQueen(locals,queens);
        }
        else {
            for (int i = 0; i < queens; i++) {
                if(Check(locals,i,index)) {
                    locals.add(i);
                    Permutation(locals, index + 1);
                    locals.remove(index);
                }

//                locals.add(i);
//                if(Check(locals,i,index))
//                    Permutation(locals,index+1);
//                locals.remove(index);
            }
        }
    }

    public static boolean Check(List<Integer> locals,int coloum,int index)
    {
        for (int i = 0; i < index; i++) {
            if (index - i == Math.abs(coloum - locals.get(i)) || locals.get(i) == coloum)
                return false;
        }
        return true;
    }

    public static void PrintQueen(List<Integer> locals,int length){
        System.out.println("第"+g_answers+"解决方案：");

        for (int i = 0; i < length; i++) {
            System.out.print(locals.get(i)+" ");
        }
        System.out.println();

    }
}
