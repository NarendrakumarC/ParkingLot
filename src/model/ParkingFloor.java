package model;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private Integer floorNo;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
