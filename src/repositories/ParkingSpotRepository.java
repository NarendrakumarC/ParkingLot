package repositories;

import enums.ParkingSpotStatus;
import enums.VehicalType;
import model.ParkingFloor;
import model.ParkingSpot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingSpotRepository {
    private Map<Integer, ParkingSpot> parkingSpotRepo = new HashMap<>();

    public ParkingSpotRepository(){
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setId(121);
        parkingSpot.setSpotNo(111);
        parkingSpot.setParkingFloor(new ParkingFloor(2));
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
        parkingSpot.setVehicalType(VehicalType.TWO_WHEELER);
        parkingSpotRepo.put(parkingSpot.getId(),parkingSpot);
    }


    public List<ParkingSpot> getAllParkingSpots(){
        return (List<ParkingSpot>) parkingSpotRepo.values();
    }
}
