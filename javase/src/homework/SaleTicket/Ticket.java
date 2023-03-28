package homework.SaleTicket;

public class Ticket {
    private double price;
    private String color;

    public Ticket() {
    }

    public Ticket(double price, String color) {
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void BuyTicketNum(double ticketNum){
        synchronized (this){
            double first = this.getPrice();
            double after = first - ticketNum;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setPrice(after);
        }
    }



}
