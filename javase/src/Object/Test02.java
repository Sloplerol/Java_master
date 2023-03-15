package Object;

public class Test02 {
    public static void main(String[] args) {
        Hello h = new Hello(1970,10,2);
        Hello h1 = new Hello(1970,10,2);
        System.out.println(h.equals(h1));
    }

}

class Hello{
    int year;
    int month;
    int day;

    public Hello() {
    }

    public Hello(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public boolean equals(Object obj){
        //获取用户传入的数据
//        int year1 = year;
//        int month1 = month;
//        int day1 = day;
//        //获取obj里的年月日,由于没有所以需要向下转型为当前类
//        if(obj instanceof Hello){
//            Hello u = (Hello) obj;
//            int year2 = u.year;
//            int month2 = u.month;
//            int day2 = u.day;
//            if(year1 == year2 && month1 == month2 && day1 == day2){
//                return true;
//            }
//        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Hello)){
            return false;
        }

        if(this == obj){
            return true;
        }

        Hello h1 = (Hello)obj;
        return h1.day == day && h1.year == year && h1.month == month;



    }


}
