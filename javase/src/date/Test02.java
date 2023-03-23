package date;

public class Test02 {
    public static void main(String[] args) {
        //输入当前时间距离1970 0 0 0的毫秒数
        long time = System.currentTimeMillis();
        System.out.println(time);

        long time1 = System.currentTimeMillis();
        print();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);



    }
    public static void print(){
        for(int i = 0;i<1000;i++){
            System.out.println("i"+i);
        }
    }
}
