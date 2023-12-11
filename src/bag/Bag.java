package bag;

import invitation.Invitation;
import ticket.Ticket;

public class Bag {

    private Long amount;

    private Invitation invitation;

    private Ticket ticket;

    public Bag(long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        this.ticket = ticket;

        if (hasInvitation()) {
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public boolean hasInvitation() {
        return ticket != null;
    }

    public boolean hasTicket() {
        return invitation != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

}
