package algorithmic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:03 18-6-11
 * @Modified: null
 */
public class MyBackDate {
    private int solutions;
    private int queens;
    private List<Integer> locals;
    private long starttime;
    private long endtime;

    public MyBackDate(int n){
        this.queens = n;
        locals = new ArrayList<Integer>();

    }

    public void start(){
        starttime = System.currentTimeMillis();
        Place(0);
        endtime = System.currentTimeMillis();
    }


    public void BackTrace(int index){
        if(locals.size() == queens)
        {
            solutions++;
            PrintQueens();
        }else {
            for(int i = 0; i < queens; i++)
                if(Check(i,index)){
                locals.add(i);
                BackTrace(index+1);
                locals.remove(index);
                }
        }
    }

    public void Place(int index)
    {
        if(index == queens)
        {
            solutions++;
            System.out.println("第"+solutions+"解决方案：");
            PrintQueens();
        }
        else
            for (int i = 0; i < queens; i++) {
                if(Check(i,index))
                {
                    locals.add(i);
                    Place(index+1);
                    locals.remove(index);
                }
            }
    }
    public boolean Check(int coloum , int index)
    {
        for (int i = 0; i < locals.size(); i++) {
            if(index-i == Math.abs(coloum-locals.get(i)) || coloum == locals.get(i))
                return false;
        }
        return true;
    }

    public void PrintQueens()
    {
        for (int i = 0; i < locals.size(); i++) {
            System.out.print(locals.get(i)+" ");
        }
        System.out.println();
    }

    public void getTime(){
        System.out.println("总共耗费时间为："+(endtime-starttime));
    }

    public static void main(String[] args) {
        MyBackDate myBackDate = new MyBackDate(8);
        myBackDate.start();
        myBackDate.getTime();
    }
}
