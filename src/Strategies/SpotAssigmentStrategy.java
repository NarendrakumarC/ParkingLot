package Strategies;

import enums.VehicalType;
import model.Gate;
import model.ParkingSpot;

public interface SpotAssigmentStrategy {
     ParkingSpot assignSpot(VehicalType vehicalType, Gate gate);
}
