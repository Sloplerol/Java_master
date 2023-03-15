package Interface;

public class interface03 {
    public static void main(String[] args) {
        fly f = new Apple();
        f.m1();
        Fruit f1 = new Banana();

    }
}

class Fruit{

}

interface fly{
    void m1();
}

class Apple extends Fruit implements fly{
    public void m1(){
        System.out.println("hello Apple");
    }
}

class Banana extends Fruit{
    public void hello(){
        System.out.println("我不会非");
    }
}

