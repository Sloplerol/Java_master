package Object;

public class Test01 {
    public static void main(String[] args) {
        Newyear n = new Newyear(1920,1,10);
        String s1 = n.toString();
        System.out.println(s1);
    }
}

class Newyear{
    int year;
    int month;
    int day;

    public Newyear(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Newyear() {
    }

    public String toString(){
        return this.year + "年" + this.month + "月" + this.day + "日";
    }
}

