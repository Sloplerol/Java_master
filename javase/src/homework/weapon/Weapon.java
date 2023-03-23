package homework.weapon;

public class Weapon {
    public static void main(String[] args) {
        Army am = new Army(2);

        Tank tk = new Tank();

        Paotai pt = new Paotai();

        BumbPlane bp = new BumbPlane();

        try{
            am.addWeapon(tk);
            am.addWeapon(pt);
            am.addWeapon(bp);
            am.addWeapon(bp);
            am.addWeapon(bp);
        }catch (WeaponExceptin e){
            e.printStackTrace();
        }

        am.moveAll();

        am.attackAll();
    }



}
