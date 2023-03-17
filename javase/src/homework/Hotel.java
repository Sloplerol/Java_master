package homework;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        for(int i = 0;i<rooms.length;i++){
            for(int j = 0;j< rooms[i].length;j++){
                if(i == 0){
                    rooms[i][j] = new Room((i+1)*100 + j + 1,"单人间",true);
                }else if(i == 1){
                    rooms[i][j] = new Room((i+1)*100 + j + 1,"双人间",true);
                }else {
                    rooms[i][j] = new Room((i+1)*100 + j + 1,"总统套房",true);
                }

            }
        }
    }
    //查看房间状态
    public void print(){
        for(int i = 0;i< rooms.length;i++){
            for(int j = 0;j< rooms[i].length;j++){
                Room room = rooms[i][j];
                System.out.println(room);
            }
            System.out.println();
        }
    }
    //订房
    public void order(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo % 10 - 1];
        room.setEmpty(false);
        System.out.println("订房成功");
    }
    //退房
    public void exit(int roomNo){
        Room room = rooms[roomNo / 100 - 1][roomNo % 10 - 1];
        room.setEmpty(true);
        System.out.println("退房成功");
    }

}
