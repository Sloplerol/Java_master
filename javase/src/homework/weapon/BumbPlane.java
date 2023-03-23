package homework.weapon;

public class BumbPlane extends Weapon implements Movable{
    @Override
    public void move() {
        System.out.println("飞机可以移动");
    }


}
