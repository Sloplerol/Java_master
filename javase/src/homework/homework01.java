package homework;

public class homework01 {
    public static void main(String[] args) {
        //通过无参数构造方法创建对象
        Vehicle v = new Vehicle();
        //通过有参数构造方法创建对象
        Vehicle v1 = new Vehicle(100,20);

        System.out.println(v1.getSize());
        System.out.println(v1.getSpeed());

        v1.speedup(10);
        System.out.println("加速之后值为"+v1.getSpeed());

        v1.speeddown(1000);
        System.out.println("减速之后的值为"+v1.getSpeed());
    }
}

class Vehicle{
    private int speed;

    private int size;

    public void move(){

    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }
    public Vehicle() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void speedup(int upspeed){
        //谁调用speedup this就指向谁
        int oldspeed = this.getSpeed();
        this.setSpeed(oldspeed+upspeed);
    }

    public void speeddown(int downspeed){
        if(this.getSpeed() >= downspeed){
            this.setSpeed(this.getSpeed()-downspeed);
        }else {
            return;
        }
    }



}
