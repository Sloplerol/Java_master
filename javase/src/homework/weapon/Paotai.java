package homework.weapon;

public class Paotai extends Weapon implements shootable{


    @Override
    public void shoot() {
        System.out.println("炮台可以射击");
    }
}
