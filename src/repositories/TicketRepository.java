package repositories;

import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<String, Ticket> ticketRepo = new HashMap<>();

    public void saveTicket(Ticket ticket){
         ticketRepo.put(ticket.getTicketNo(),ticket);
    }
}
