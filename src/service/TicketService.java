package service;

import Strategies.SpotAssigmentStrategy;
import enums.SpotAssigmentStrategyType;
import enums.TicketStatus;
import enums.VehicalType;
import exceptions.GateNotFoundException;
import factory.SpotAssigmentFactory;
import model.*;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicalRepository;

import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;

    private VehicalRepository vehicalRepository;

    private ParkingLotRepository parkingLotRepository;

    private TicketRepository ticketRepository;



    public TicketService(GateRepository repository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository,
                         VehicalRepository vehicalRepository){
        this.gateRepository = repository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.vehicalRepository =vehicalRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicalNo,
                              String ownerName, VehicalType vehicalType, Long parkingLotId) throws GateNotFoundException {
        //contain business logic to issue the ticket
        Ticket ticket = new Ticket();
        ticket.setEntryTime(System.currentTimeMillis());
       Optional<Gate> optionalGate= gateRepository.findByGateId(gateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Gate with gateId "+gateId+ "is not found in parking lot");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);

        Optional<Vehical> optionalVehical = vehicalRepository.findVehicalByNumber(vehicalNo);
        Vehical savedVehical;

        if(optionalVehical.isEmpty()){
            Vehical vehical = new Vehical();
            vehical.setVehicalNo(vehicalNo);
            vehical.setOwner(new Owner(ownerName));
            vehical.setVehicalType(vehicalType);
            vehicalRepository.save(vehical);
            savedVehical = vehical;
        }else {
            savedVehical = optionalVehical.get();
        }

        ticket.setVehical(savedVehical);
        ticket.setTicketStatus(TicketStatus.VALID);
        ticket.setTicketNo("TICKET_" +gateId+"_"+vehicalNo+"_"+ticket.getGeneratedAt().getOperator());

        Optional<ParkingLot> optionalParkingLot = parkingLotRepository.getParkingLotById(parkingLotId);
        if(optionalParkingLot.isEmpty()){
            throw new RuntimeException("Invalid parking lot id");
        }
        ParkingLot parkingLot = optionalParkingLot.get();
        SpotAssigmentStrategyType assigmentStrategyType= parkingLot.getSpotAssigmentStrategyType();

        //based on the type, get the corresponding algorithm

        SpotAssigmentStrategy spotAssigmentStrategy =  SpotAssigmentFactory.getSpotAssigmentStrategy(assigmentStrategyType);
        ParkingSpot parkingSpot = spotAssigmentStrategy.assignSpot(vehicalType,gate);
         ticket.setParkingSpot(parkingSpot);
        ticketRepository.saveTicket(ticket);
        return ticket;

    }
}
