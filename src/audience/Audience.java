package audience;

import bag.Bag;
import ticket.Ticket;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public boolean checkInvitation() {
        return bag.hasInvitation();
    }

    public void receiveTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }

    public void purchaseTicket(Ticket ticket) {
        bag.minusAmount(ticket.getFee());
        bag.setTicket(ticket);
    }
}
