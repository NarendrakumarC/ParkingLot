package model;

import enums.ParkingSpotStatus;
import enums.SpotAssigmentStrategyType;
import enums.VehicalType;

public class ParkingSpot extends BaseModel{
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor;
    private Integer spotNo;
    private VehicalType vehicalType;


    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public Integer getSpotNo() {
        return spotNo;
    }

    public void setSpotNo(Integer spotNo) {
        this.spotNo = spotNo;
    }

    public VehicalType getVehicalType() {
        return vehicalType;
    }

    public void setVehicalType(VehicalType vehicalType) {
        this.vehicalType = vehicalType;
    }
}
