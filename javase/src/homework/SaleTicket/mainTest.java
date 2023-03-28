package homework.SaleTicket;

public class mainTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new TicketThread(ticket);
        Thread t2 = new TicketThread(ticket);

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();



    }
}

