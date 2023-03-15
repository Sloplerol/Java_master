package homework;

public class homework04 {
    public static void main(String[] args) {
        time t = new time(10,2,10);
        t.checktime();
        t.addSecond(100);
        t.checktime();
        t.addHour(3);
        t.checktime();
        t.addMinute(120);
        t.checktime();
    }
}

class time{
    private int hour;
    private int minute;
    private int second;


    public time() {
    }

    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void checktime(){
        System.out.println(this.hour+"h"+"-"+this.minute+"m"+"-"+this.second+"s");
    }
    public void addSecond(int addsecond){
        int oldsecond = this.second;
        int result = oldsecond + addsecond;
        if(result <60){
            this.setSecond(result);
        }else if(result==60){
            this.addMinute(1);
            this.setSecond(0);
        }else {
            int mn = result / 60;
            int se = result % 60;
            this.addMinute(mn);
            this.setSecond(se);
        }

    }

    public void addMinute(int addminute){
        int oldminute = this.minute;
        int result = oldminute + addminute;
        if(result<60){
            this.setMinute(result);
        }else if(result == 60){
            this.addHour(1);
            this.setMinute(0);
        }else {
            int ho = result / 60;
            int mn = result % 60;
            this.addHour(ho);
            this.setMinute(mn);
        }
    }

    public void addHour(int addhour){
        this.setHour(this.getHour()+addhour);

    }

}
