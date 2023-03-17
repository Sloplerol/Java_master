package homework;

public class HotelSys {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        System.out.println("欢迎使用旅店管理系统，请查看以下服务，并且输入指定编号");
        System.out.println("[1] 查看旅店状态 [2]订购房间 [3]退订房间 [4]退出系统");
        java.util.Scanner s = new java.util.Scanner(System.in);

        while(true){
            System.out.print("请输入序号: ");
            int line = s.nextInt();
            if(line == 1){
                hotel.print();
            }else if(line == 2){
                System.out.println("请输入你要订购的房间编号");
                int s1 = s.nextInt();
                hotel.order(s1);
            }else if(line == 3){
                System.out.println("请输入你要退订的房间");
                int s2 = s.nextInt();
                hotel.exit(s2);
            }else if(line == 4){
                System.out.println("欢迎下次再来");
                break;
            }else {
                System.out.println("输入不合法请重新输入");
            }
        }
    }
}
