package Strategies;

import enums.ParkingSpotStatus;
import enums.VehicalType;
import model.Gate;
import model.ParkingSpot;
import repositories.ParkingSpotRepository;

import java.util.List;

public class NearestSpotAssigmentStrategy implements SpotAssigmentStrategy{

    private ParkingSpotRepository parkingSpotRepository;

    public NearestSpotAssigmentStrategy(ParkingSpotRepository repository){
        this.parkingSpotRepository = repository;
    }

    public NearestSpotAssigmentStrategy() {

    }

    @Override
    public ParkingSpot assignSpot(VehicalType vehicalType, Gate gate) {
        List<ParkingSpot> parkingspotsList = parkingSpotRepository.getAllParkingSpots();
        for (ParkingSpot spot:parkingspotsList){
            if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)){
                return spot;
            }
        }
        ParkingSpot parkingSpot =new ParkingSpot();
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
        return parkingSpot;
    }
}
