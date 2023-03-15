package homework;

public class homework5 {
    public static void main(String[] args) {
        computer c = new computer();

        mouse m = new mouse();
        System.out.println(m.add(1,2));

    }
}

class computer implements InsertDrawable{
    private int price;
    private String name;

    public computer() {
    }

    public computer(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int add(int a,int b){
        return a+b;
    }
}

interface InsertDrawable{
    int a = 10;
    int b = 20;
    int add(int a,int b);
}
class mouse implements InsertDrawable{
    public int add(int a,int b){
        return a+b;
    }
}

class displayer extends computer{

}

class printer extends computer{

}
