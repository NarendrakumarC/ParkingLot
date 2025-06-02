import controller.TicketController;
import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import enums.VehicalType;
import repositories.*;
import service.TicketService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicalRepository vehicalRepository = new VehicalRepository();

        TicketService ticketService = new TicketService(gateRepository,parkingLotRepository,ticketRepository,vehicalRepository);
        TicketController  ticketController = new TicketController(ticketService);
        IssueTicketRequestDTO requestDTO = new IssueTicketRequestDTO();
        requestDTO.setVehicalOwnerName("Narendra");
        requestDTO.setVehicalNumber("KA052221");
        requestDTO.setVehicalType(VehicalType.SUV);
        requestDTO.setParkingLotId(1L);
        requestDTO.setGateId(2L);
        IssueTicketResponseDTO responseDTO = ticketController.issueTicket(requestDTO);
        System.out.println(responseDTO.toString());
        System.out.println(responseDTO.getResponseStatus());

    }
}