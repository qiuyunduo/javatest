package testaboutobserver;

import javafx.geometry.Pos;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午8:23 18-6-3
 * @Modified: null
 */
public class Hero extends MyObservered implements MyObserver {
    private String name;
    private Position position;

    public Hero(String name){
        this.name = name;
        position = new Position(0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
        notifyAllObserver();
    }



    @Override
    public void update(MyObservered myObservered, Object o) {
        if (myObservered instanceof Hero){
            Hero hero = (Hero)myObservered;
            System.out.println(this.name + "发现了 " + hero.getName() + "在" +hero.getPosition().toString());


        }

    }

    public static void main(String[] args) {
        Hero hero1 = new Hero("刘备");
        Hero hero2 = new Hero("张飞");
        Hero hero3 = new Hero("关羽");

        hero1.addMyObserver(hero2);
        hero1.addMyObserver(hero3);

        Position position = new Position(1,1);
        hero1.setPosition(position);
    }
}
