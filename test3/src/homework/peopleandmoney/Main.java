package homework.peopleandmoney;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午3:34 18-5-29
 * @Modified: null
 */
public class Main {
    public static void main(String[] args) {
        Money money = new Money("money");
        money.speak();

        People people = new People("people");
        people.speak();
        people.think();
    }
}
