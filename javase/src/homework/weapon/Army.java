package homework.weapon;

public class Army {
    //定义武器数组
    private Weapon[] weapons;

    public Army(int i){
        weapons = new Weapon[i];
    }

    //添加武器
    public void addWeapon(Weapon weapon) throws WeaponExceptin {
        for(int i = 0;i<weapons.length;i++){
            if(weapons[i] == null){
                weapons[i] =  weapon;
                return;
            }
        }
        throw new WeaponExceptin("武器库已满");
    }
    //武器进行移动
    public void moveAll(){
        for(int i = 0;i<weapons.length;i++){
            if(weapons[i] instanceof shootable){
                //通过多态的方式将weapons里每一个武器强制类型转化调用shoot方法
                shootable sa = (shootable)weapons[i];
                sa.shoot();
            }
        }
    }
    //武器进行攻击
    public void attackAll(){
        for(int i = 0;i<weapons.length;i++){
            if(weapons[i] instanceof Movable){
                //类和接口之间是可以直接进行强制类型转化
                Movable ma = (Movable)weapons[i];
                ma.move();
            }
        }

    }
}
