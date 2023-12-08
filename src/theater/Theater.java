package theater;

import audience.Audience;
import ticket.Ticket;
import ticketseller.TicketSeller;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        Ticket ticket;
        // 초대장이 있으면 무료입장
        if (audience.checkInvitation()) {
            ticket = ticketSeller.exchangeTicket();
            audience.receiveTicket(ticket);
            return;
        }
        // 없으면 요금 받고 티켓 판매
        ticket = ticketSeller.sellTicket();
        audience.purchaseTicket (ticket);
    }
}
