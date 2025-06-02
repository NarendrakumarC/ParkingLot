package repositories;

import enums.GateStatus;
import enums.ParkingLotStatus;
import enums.SpotAssigmentStrategyType;
import model.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotRepo = new HashMap<>();

    public ParkingLotRepository(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setParkingLotId((long) 1L);
        parkingLot.setAddress("Bengaluru");
        parkingLot.setCapacity(2);
        parkingLot.setParkingFloors(Arrays.asList(new ParkingFloor(456), new ParkingFloor(789)));
        parkingLot.setGates(Arrays.asList(new Gate(10L,new Operator("Vikas"), GateStatus.OPEN),
                        new Gate(20L,new Operator("Vilas"),GateStatus.OPEN)));
        parkingLot.setParkingLotStatus(ParkingLotStatus.ACTIVE);
        parkingLot.setSpotAssigmentStrategyType(SpotAssigmentStrategyType.NEAREST);
    parkingLotRepo.put(parkingLot.getParkingLotId(),parkingLot);
    }
    public Optional<ParkingLot> getParkingLotById(Long id){
        if(parkingLotRepo.containsKey(id)){
            return Optional.of(parkingLotRepo.get(id));
        }
        return Optional.empty();
    }

}
