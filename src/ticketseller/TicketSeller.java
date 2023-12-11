package ticketseller;

import audience.Audience;
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

    public void sellTo(Audience audience) {
        this.ticketOffice.sellTicketTo(audience);
    }
}
