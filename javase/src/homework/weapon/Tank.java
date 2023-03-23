package homework.weapon;

public class Tank extends Weapon implements Movable,shootable {
    @Override
    public void move() {
        System.out.println("坦克可以进行移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克可以进行射击");
    }
}
