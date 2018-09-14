package thread.consumes;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 上午9:13 18-5-25
 * @Modified: null
 */
public class KFC {

    //食物的种类
    String names[] = {"薯条","烧饭","鸡翅","可乐"};

    //生产的最大值，到达后可以休息
    static final int max = 20;

    //存放食物的集合
    List<Food> foods = new ArrayList<Food>();

    //生产食物的方法
    public void productfoods(int index)
    {
        synchronized (this) {
            while (foods.size() > max){
                System.out.println("食材够了");
                this.notifyAll();  //唤醒生产者和消费者
                try{
                    String name =Thread.currentThread().getName();
                    this.wait();
                    System.out.println("生产者：　"+name);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            System.out.println("开始生产食物");
            for(int i = 0; i < index; i++)
            {
                Food food = new Food(names[(int)Math.random()*4]);
                foods.add(food);
                System.out.println("生产了"+food.getName()+" 当前食物数量："+foods.size());
            }
        }

    }

    //消费食物的方法
    public void consumefoods(int index)
    {
        synchronized (this) {
            while (foods.size() < index){
                System.out.println("食材不够了");
                this.notifyAll();  //唤醒生产者和消费者
                try{
                    String name =Thread.currentThread().getName();
                    this.wait();
                    System.out.println("消费者：　"+name);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            System.out.println("开始消费");
            for(int i = 0; i < index; i++)
            {
                Food food = foods.remove(foods.size()-1);
                System.out.println("消费了"+food.getName()+" 当前食物数量："+foods.size());
            }
        }
    }
}
