package homework.SaleTicket;

public class TicketThread extends Thread{
    private Ticket ticket;

    public TicketThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.BuyTicketNum(50);

        System.out.println(Thread.currentThread().getName() + "------>" + ticket.getPrice());
    }
}
