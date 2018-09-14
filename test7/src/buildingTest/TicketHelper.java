package buildingTest;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午9:02 18-8-14
 * @Modified: null
 */
public class TicketHelper {
    public void BuildingAdult(String info){
        System.out.println("构建成年人票的逻辑"+info);
    }
    public void BuildingChildForSeat(String info){
        System.out.println("构建成有座儿童票的逻辑"+info);
    }
    public void BuildingChildNoSeat(String info){
        System.out.println("构建成无座儿童票的逻辑"+info);
    }
    public void BuildingOldMan(String info){
        System.out.println("构建老年人票的逻辑"+info);
    }
    public void BuildingSolider(String info){
        System.out.println("构建军人票的逻辑"+info);
    }
}
