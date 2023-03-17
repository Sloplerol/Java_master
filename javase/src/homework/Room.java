package homework;

public class Room {
    private int no;

    private String type;

    private boolean isEmpty;

    public Room() {
    }

    public Room(int no, String type, boolean isEmpty) {
        this.no = no;
        this.type = type;
        this.isEmpty = isEmpty;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String toString(){
        return "["+no+","+type+","+(isEmpty ? "空闲" : "满了")+"]";
    }

    public boolean equals(Object obj) {
        if(obj == null && !(obj instanceof Room)) return false;
        if(obj == this) return true;
        Room room = (Room) obj;
        return room.getNo() == this.no;
    }
}

class RoomTest{
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.print();
    }
}


