package buildingTest;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午9:05 18-8-14
 * @Modified: null
 */
public class testBuilding {
    public static void main(String[] args) {
        TicketHelper ticketHelper = new TicketHelper();
        ticketHelper.BuildingAdult("成人票");
        ticketHelper.BuildingChildForSeat("有座儿童票");
        ticketHelper.BuildingChildNoSeat("无座儿童票");
        ticketHelper.BuildingOldMan("老年人票");
        ticketHelper.BuildingSolider("军人票");

        Object obj = TicketBuild.building(ticketHelper);
    }


}
