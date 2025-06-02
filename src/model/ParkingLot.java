package model;

import enums.ParkingLotStatus;
import enums.SpotAssigmentStrategyType;

import java.util.List;

public class ParkingLot extends  BaseModel {

    private Long parkingLotId;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> gates;
    private ParkingLotManager parkingLotManager;
    private String address;
    private Integer capacity;
    private SpotAssigmentStrategyType spotAssigmentStrategyType;

    public Long getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public SpotAssigmentStrategyType getSpotAssigmentStrategyType() {
        return spotAssigmentStrategyType;
    }

    public void setSpotAssigmentStrategyType(SpotAssigmentStrategyType spotAssigmentStrategyType) {
        this.spotAssigmentStrategyType = spotAssigmentStrategyType;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotManager getParkingLotManager() {
        return parkingLotManager;
    }

    public void setParkingLotManager(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
