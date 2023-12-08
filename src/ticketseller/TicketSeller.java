package ticketseller;

import ticket.Ticket;
import ticketoffice.TicketOffice;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public Ticket exchangeTicket() {
        return getTicketOffice().getTicket();
    }

    public Ticket sellTicket() {
        Ticket ticket = exchangeTicket();
        receiveFee(ticket.getFee());
        return ticket;
    }

    private void receiveFee(Long fee) {
        getTicketOffice().plusAmount(fee);
    }
}
