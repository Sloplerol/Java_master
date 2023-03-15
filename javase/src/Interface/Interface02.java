package Interface;

public class Interface02 {
    public static void main(String[] args) {
        D d = new H();
        E e = new H();
        F f = new H();


    }
}

interface D{
    void m1();
}

interface E{
    void m2();
}

interface F{
    void m3();
}

class H implements D,E,F{
    public void m1(){}
    public void m2(){
        System.out.println("Hello world");
    }
    public void m3(){}

}

