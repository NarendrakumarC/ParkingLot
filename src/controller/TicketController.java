package controller;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import model.Ticket;
import service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService =ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();
      try{


        Ticket ticket = ticketService.issueTicket(requestDTO.getGateId(), requestDTO.getVehicalNumber(),
                requestDTO.getVehicalOwnerName(), requestDTO.getVehicalType(),
                requestDTO.getParkingLotId());
        issueTicketResponseDTO.setTicket(ticket);
        issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCES);

      }catch (Exception ex){
          issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILED);
      }

        return issueTicketResponseDTO;
    }


}
